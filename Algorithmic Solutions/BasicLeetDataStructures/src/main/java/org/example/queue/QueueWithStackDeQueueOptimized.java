package org.example.queue;

import java.util.Stack;

public class QueueWithStackDeQueueOptimized<T> implements Queue<T> {

    Stack<T> s1 = new Stack<T>();
    Stack<T> s2 = new Stack<T>();
    private T front;
    private int size;
    private int count;

    public QueueWithStackDeQueueOptimized(int size){
        this.size = size;
    }

    public void enQueue(T data){
        if(isFull()) throw new RuntimeException("Failed to push into a full stack");
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
        count++;
    }

    @Override
    public Integer size() {
        return count;
    }

    public T deQueue(){
        if(isEmpty()) throw new ArrayIndexOutOfBoundsException("Failed to deQueue! Queue is empty");
        if (!s1.empty())
            front = s1.peek();
        count--;
        return s1.pop();
    }

    @Override
    public Boolean isFull() {
        return this.size()==this.size;
    }

    public Boolean isEmpty(){
        return s1.isEmpty();
    }

    public T peek(){
        return front;
    }

}
