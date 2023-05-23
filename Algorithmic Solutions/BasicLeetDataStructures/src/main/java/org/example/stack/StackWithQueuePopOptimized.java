package org.example.stack;

import java.util.LinkedList;
import java.util.Queue;

// push->O(n)
// pop->O(1)
public class StackWithQueuePopOptimized<T> implements Stack<T> {

    Queue<T> q1 = new LinkedList<T>();
    Queue<T> q2 = new LinkedList<T>();
    private int size;

    public StackWithQueuePopOptimized(int size){
        this.size = size;
    }

    public void push(T data){
        if(isFull()) throw new RuntimeException("Failed to push into a full stack");
        while (q1.size()>0){
            q2.add(q1.remove());
        }
        q1.add(data);
        while (q2.size()>0){
            q1.add(q2.remove());
        }
    }

    public T pop(){
        if(isEmpty()) throw new ArrayIndexOutOfBoundsException("Failed to pop! Stack is empty");
        return q1.remove();
    }

    @Override
    public Integer size() {
        return q1.size();
    }

    @Override
    public Boolean isFull() {
        return q1.size()==this.size;
    }

    @Override
    public Boolean isEmpty() {
        return q1.isEmpty();
    }

    public void display(){
        System.out.print(q1.toString());
    }

}
