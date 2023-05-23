package org.example.queue;


import java.util.Stack;

public class QueueWithStackEnQueueOptimized<T> implements Queue<T> {

    Stack<T> s1 = new Stack<T>();
    Stack<T> s2 = new Stack<T>();
    private int size;
    private int count;

    public QueueWithStackEnQueueOptimized(int size){
        this.size = size;
    }

    public Boolean isFull(){
        return this.size()==this.size;
    }

    public Boolean isEmpty(){
        return s1.stream().count()==0;
    }

    public T peek() {
        return null;
    }

    public void enQueue(T data){
        if(isFull()) throw new RuntimeException("Failed to push into a full stack");
        s1.push(data);
        count++;
    }

    public Integer size() {
        return count;
    }

    public T deQueue(){
        if(isEmpty()) throw new ArrayIndexOutOfBoundsException("Failed to deQueue! Queue is empty");
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        T res = s2.pop();
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        count--;
        return res;
    }

}
