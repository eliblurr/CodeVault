package queue;

import org.example.queue.CustomQueue;
import org.example.queue.Queue;
import org.example.queue.QueueWithStackDeQueueOptimized;
import org.example.queue.QueueWithStackEnQueueOptimized;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class QueueTest {

    static final int size = 5;
    static Queue<Integer> customQueue;
    static Queue<Integer> queueWithStackDeQueueOptimized;
    static Queue<Integer> queueWithStackEnQueueOptimized;

    @BeforeAll
    static void setUp(){
        customQueue = new CustomQueue(size);
        queueWithStackDeQueueOptimized = new QueueWithStackDeQueueOptimized(size);
        queueWithStackEnQueueOptimized = new QueueWithStackEnQueueOptimized(size);
    }

    @BeforeEach
    void init(){
        while(customQueue.size()!=0) customQueue.deQueue();
        while(queueWithStackDeQueueOptimized.size()!=0) queueWithStackDeQueueOptimized.deQueue();
        while(queueWithStackEnQueueOptimized.size()!=0) queueWithStackEnQueueOptimized.deQueue();
    }

    @ParameterizedTest
    @MethodSource("queueStream")
    void verifyEnQueueWhenQueueIsNotFull(Queue<Integer> queue) {
        queue.enQueue(2);
        assertEquals(2, queue.deQueue());
    }

    @ParameterizedTest
    @MethodSource("queueStream")
    void verifyEnQueueFailsWhenQueueIsFull(Queue<Integer> queue) {
        for(int i=0; i < size; i++) queue.enQueue(i);
        assertThrows(RuntimeException.class, ()->queue.enQueue(67));
    }

    @ParameterizedTest
    @MethodSource("queueStream")
    void verifyIsFullIsTrueWhenQueueIsFull(Queue<Integer> queue) {
        for(int i=0; i < size; i++) queue.enQueue(i);
        assertTrue(queue.isFull());
    }

    @ParameterizedTest
    @MethodSource("queueStream")
    void verifyIsFullIsFalseWhenQueueIsNotFull(Queue<Integer> queue) {
        assertFalse(queue.isFull());
    }

    @ParameterizedTest
    @MethodSource("queueStream")
    void verifyIsEmptyIsTrueWhenQueueIsEmpty(Queue<Integer> queue) {
        assertTrue(queue.isEmpty());
    }

    @ParameterizedTest
    @MethodSource("queueStream")
    void verifyIsEmptyIsFalseWhenQueueIsNotEmpty(Queue<Integer> queue) {
        queue.enQueue(8);
        assertFalse(queue.isEmpty());
    }

    @ParameterizedTest
    @MethodSource("queueStream")
    void verifySizeWhenQueueIsEmpty(Queue<Integer> queue) {
        assertEquals(0, queue.size());
    }

    @ParameterizedTest
    @MethodSource("queueStream")
    void verifySizeWhenQueueIsNotEmpty(Queue<Integer> queue) {
        queue.enQueue(8);
        queue.enQueue(8);
        assertEquals(2, queue.size());
    }

    @ParameterizedTest
    @MethodSource("queueStream")
    void verifyPopWhenStackIsEmpty(Queue<Integer> queue) {
        assertThrows(ArrayIndexOutOfBoundsException.class, ()->queue.deQueue());
    }

    static Stream<Queue<Integer>> queueStream() {
        return Stream.of(customQueue, queueWithStackDeQueueOptimized, queueWithStackEnQueueOptimized);
    }

}
