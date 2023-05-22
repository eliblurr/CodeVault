package org.example;

import org.example.queue.Queue;
import org.example.queue.QueueWithStackDeQueueOptimized;
import org.example.queue.QueueWithStackEnQueueOptimized;
import org.example.stack.Stack;
import org.example.stack.StackWithQueuePopOptimized;
import org.example.stack.StackWithQueuePushOptimized;

public class Main {
    public static void main(String[] args) {

        Long start;

        System.out.println("Stack with Queue Pop Optimised\n-------------------------------");
        Stack stackWithQueuePopOptimized = new StackWithQueuePopOptimized(12);

        for (int i = 1; i < 5; i++){
            start = System.currentTimeMillis();
            stackWithQueuePopOptimized.push(i);
            stackWithQueuePopOptimized.display();
            System.out.println(" time to push "+ i + (i==1 ? "st" : i==2 ? "nd" : i==3 ? "rd" : "th") + " element: " + (System.currentTimeMillis()-start)+"ms");
        }
        for (int i = 0; i < 3; i++) {
            start = System.currentTimeMillis();
            stackWithQueuePopOptimized.pop();
            stackWithQueuePopOptimized.display();
            System.out.print(" time to pop from stack: " + (System.currentTimeMillis()-start)+"ms\n");
        }

        System.out.println("\nStack with Queue Push Optimised\n--------------------------------");
        Stack stackWithQueuePushOptimized = new StackWithQueuePushOptimized(12);

        for (int i = 1; i < 6; i++){
            start = System.currentTimeMillis();
            stackWithQueuePushOptimized.push(i);
            stackWithQueuePushOptimized.display();
            System.out.println(" time to push "+ i + (i==1 ? "st" : i==2 ? "nd" : i==3 ? "rd" : "th") + " element: " + (System.currentTimeMillis()-start)+"ms");
        }
        for (int i = 0; i < 2; i++) {
            start = System.currentTimeMillis();
            stackWithQueuePushOptimized.pop();
            stackWithQueuePushOptimized.display();
            System.out.print(" time to pop from stack: " + (System.currentTimeMillis()-start)+"ms\n");
        }

        System.out.println("\nQueue with Stack enQueue Optimised\n--------------------------------");
        Queue queueWithStackEnQueueOptimized = new QueueWithStackEnQueueOptimized(5);

        for (int i=1; i<5; i++){
            start = System.currentTimeMillis();
            queueWithStackEnQueueOptimized.enQueue(i);
            System.out.println(" time to enQueue "+ i + (i==1 ? "st" : i==2 ? "nd" : i==3 ? "rd" : "th") + " element: " + (System.currentTimeMillis()-start)+"ms");
        }
        for (int i=1; i<5; i++){
            start = System.currentTimeMillis();
            queueWithStackEnQueueOptimized.deQueue();
            System.out.println(" time to deQueue " + (System.currentTimeMillis()-start)+"ms");
        }

        System.out.println("\nQueue with Stack deQueue Optimised\n--------------------------------");
        Queue queueWithStackDeQueueOptimized = new QueueWithStackDeQueueOptimized();

        for (int i=1; i<5; i++){
            start = System.currentTimeMillis();
            queueWithStackDeQueueOptimized.enQueue(i);
            System.out.println(" time to enQueue "+ i + (i==1 ? "st" : i==2 ? "nd" : i==3 ? "rd" : "th") + " element: " + (System.currentTimeMillis()-start)+"ms");
        }
        for (int i=1; i<2; i++){
            start = System.currentTimeMillis();
            queueWithStackDeQueueOptimized.deQueue();
            System.out.println(" time to deQueue " + (System.currentTimeMillis()-start)+"ms");
        }

    }
}