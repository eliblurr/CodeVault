package org.example;

public class Logger {

    private static Logger instance;

    // Private constructor to prevent instantiation from outside the class
    private Logger() {
        // Perform any necessary initialization here
    }

    // Method to get the singleton instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Log a message
    public void log(String message) {
        // Print to System Output [console]
        System.out.println("Log: " + message);
    }

    public static void reset(){
        instance = null;
    }

}
