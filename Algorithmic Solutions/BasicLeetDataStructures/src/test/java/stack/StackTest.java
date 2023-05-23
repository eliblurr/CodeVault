package stack;

import org.example.stack.CustomStack;
import org.example.stack.Stack;
import org.example.stack.StackWithQueuePopOptimized;
import org.example.stack.StackWithQueuePushOptimized;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    static final int size = 5;
    static Stack<Integer> customStack;
    static Stack<Integer> stackWithQueuePopOptimised;
    static Stack<Integer> stackWithQueuePushOptimised;

    @BeforeAll
    static void setUp(){
        customStack = new CustomStack(size);
        stackWithQueuePopOptimised = new StackWithQueuePopOptimized(size);
        stackWithQueuePushOptimised = new StackWithQueuePushOptimized(size);
    }

    @BeforeEach
    void init(){
        while(customStack.size()!=0) customStack.pop();
        while(stackWithQueuePopOptimised.size()!=0) stackWithQueuePopOptimised.pop();
        while(stackWithQueuePushOptimised.size()!=0) stackWithQueuePushOptimised.pop();
    }

    @ParameterizedTest
    @MethodSource("stacks")
    void verifyPushWhenStackIsNotFull(Stack<Integer> stack) {
        stack.push(2);
        assertEquals(2, stack.pop());
    }

    @ParameterizedTest
    @MethodSource("stacks")
    void verifyPushFailsWhenStackIsFull(Stack<Integer> stack) {
        System.out.println(stack.size());
        for(int i=0; i < size; i++) stack.push(i);
        System.out.println(stack.size());
        assertThrows(RuntimeException.class, ()->stack.push(67));
    }

    @ParameterizedTest
    @MethodSource("stacks")
    void verifyIsFullIsTrueWhenStackIsFull(Stack<Integer> stack) {
        for(int i=0; i < size; i++) stack.push(i);
        assertTrue(stack.isFull());
    }

    @ParameterizedTest
    @MethodSource("stacks")
    void verifyIsFullIsFalseWhenStackIsNotFull(Stack<Integer> stack) {
        assertFalse(stack.isFull());
    }

    @ParameterizedTest
    @MethodSource("stacks")
    void verifyIsEmptyIsTrueWhenStackIsEmpty(Stack<Integer> stack) {
        assertTrue(stack.isEmpty());
    }

    @ParameterizedTest
    @MethodSource("stacks")
    void verifyIsEmptyIsFalseWhenStackIsNotEmpty(Stack<Integer> stack) {
        stack.push(8);
        assertFalse(stack.isEmpty());
    }

    @ParameterizedTest
    @MethodSource("stacks")
    void verifySizeWhenStackIsEmpty(Stack<Integer> stack) {
        assertEquals(0, stack.size());
    }

    @ParameterizedTest
    @MethodSource("stacks")
    void verifySizeWhenStackIsNotEmpty(Stack<Integer> stack) {
        stack.push(8);
        stack.push(8);
        assertEquals(2, stack.size());
    }

    @ParameterizedTest
    @MethodSource("stacks")
    void verifyPopWhenStackIsEmpty(Stack<Integer> stack) {
        assertThrows(ArrayIndexOutOfBoundsException.class, ()->stack.pop());
    }

    static Stream<Stack<Integer>> stacks() {
        return Stream.of(stackWithQueuePushOptimised);
//        customStack, stackWithQueuePopOptimised, stackWithQueuePushOptimised
    }

}
