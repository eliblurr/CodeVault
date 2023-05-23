package org.example.stack;

import java.util.LinkedList;
import java.util.Queue;

// push->O(1)
// pop->O(n)
public class StackWithQueuePushOptimized<T> implements Stack<T> {

    private Queue<T> q1; // primary queue
    private Queue<T> q2; // secondary/temp queue
    private int length = 0;
    private int size;

    public StackWithQueuePushOptimized(Integer size){
        q1 =  new LinkedList<T>();
        q2 =  new LinkedList<T>();
        this.size = size;
    }

    public void push(T data){
        if(isFull()) throw new RuntimeException("Failed to push into a full stack");
        q1.add(data);
        ++length;
    }

//    lateral reflection -> if array just reverse array [::-1]
    public T pop(){
        if(isEmpty()) throw new ArrayIndexOutOfBoundsException("Failed to pop! Stack is empty");
        while (q1.size()>0){
            q2.add(q1.remove());
        }
        while (q2.size()!=1){
            q1.add(q2.remove());
        }
        length--;
        return q2.remove();
    }

    @Override
    public Integer size() {
        return 0;
    }

    public T peek(){
        for (int i=0; i<length-1; ++i){ // leave only one element
            q2.add(q1.poll());
        }
        T top = q1.poll();
        for (int i=0;i<length; i++){
            q1.add(q2.poll());
        }
        return top;
    }

    public Boolean isEmpty(){
        return length==0;
    }

    public Boolean isFull(){
        return length==size;
    }

    public void display(){
        String s = q1.toString();
        StringBuffer sbr = new StringBuffer(s.substring(1, s.length()-1));
        System.out.print("["+sbr.reverse()+"]");
    }

}
