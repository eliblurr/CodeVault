package org.example.queue;


import java.util.Stack;

public class QueueWithStackEnQueueOptimized implements Queue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    private int size;

    public QueueWithStackEnQueueOptimized(int size){
        this.size = size;
    }

    public boolean isFull(){
        return s1.stream().count()==size;
    }

    public boolean isEmpty(){
        return s1.stream().count()==0;
//        or
//        return s1.isEmpty();
    }

    @Override
    public int peek() {
        return 0;
    }

    public void enQueue(int data){
        if(isFull()){
            System.out.println("queue is full");
            return;
        }
        s1.push(data);
    }

    public int deQueue(){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int res = s2.pop();
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return res;
    }

//    enQueue
//    deQueue
//    peek
//    isEmpty

}
