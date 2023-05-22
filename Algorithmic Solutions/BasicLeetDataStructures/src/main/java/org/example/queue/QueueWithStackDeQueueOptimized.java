package org.example.queue;

import java.util.Stack;

public class QueueWithStackDeQueueOptimized implements Queue {

    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    public int front;

    public void enQueue(Integer data){
        if(s1.isEmpty()){
            front = data;
        }

        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }

        s1.push(data);

        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int deQueue(){
        if (!s1.empty())
            front = s1.peek();
        return s1.pop();
    }

    @Override
    public void enQueue(int i) {

    }

    @Override
    public boolean isFull() {
        return false;
    }

    public boolean isEmpty(){
        return s1.isEmpty();
    }

    public int peek(){
        return front;
    }

}
