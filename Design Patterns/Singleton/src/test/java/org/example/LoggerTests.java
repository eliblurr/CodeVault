package org.example;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTests {

    @Test
    public void testLoggerInstanceCreation() {
        // Ensure that the logger instance is created when calling getInstance()
        Logger.reset();
        assertNotNull(Logger.getInstance());
    }

    @Test
    public void testLoggerReset() {
        Logger logger1 = Logger.getInstance();
        Logger.reset();
        Logger logger2 = Logger.getInstance();
        assertNotSame(logger1, logger2);
    }

    @Test
    public void testLoggerInstance() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        assertSame(logger2, logger1);
    }

    @Test
    public void testLoggerInitialization() {
        Logger instance = Logger.getInstance();
        assertNotNull(instance);
    }

    @Test
    public void testSingletonLogMessage() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        // Set system output to PrintStream
        System.setOut(new PrintStream(outContent));
        Logger.getInstance().log("I am hit");
        assertEquals("Log: I am hit\n", outContent.toString());
        System.setOut(System.out);
    }

}
