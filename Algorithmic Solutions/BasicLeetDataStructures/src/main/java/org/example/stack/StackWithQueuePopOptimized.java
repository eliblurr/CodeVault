package org.example.stack;

import java.util.LinkedList;
import java.util.Queue;

// push->O(n)
// pop->O(1)
public class StackWithQueuePopOptimized implements Stack {

    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    private int size;

    public StackWithQueuePopOptimized(int size){
        this.size = size;
    }

    public void push(int data){
        while (q1.size()>0){
            q2.add(q1.remove());
        }
        q1.add(data);
        while (q2.size()>0){
            q1.add(q2.remove());
        }
    }

    public int pop(){
        return q1.remove();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public void display(){
        System.out.print(q1.toString());
    }

    // peek
    // isEmpty
    // isFull

}
