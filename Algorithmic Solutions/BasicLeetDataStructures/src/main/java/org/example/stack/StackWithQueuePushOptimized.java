package org.example.stack;

import java.util.LinkedList;
import java.util.Queue;

// push->O(1)
// pop->O(n)
public class StackWithQueuePushOptimized implements Stack {

    private Queue<Integer> q1; // primary queue
    private Queue<Integer> q2; // secondary/temp queue
    private int length = 0;
    private int size;

    public StackWithQueuePushOptimized(Integer size){
        q1 =  new LinkedList<Integer>();
        q2 =  new LinkedList<Integer>();
        this.size = size;
    }

    public void push(int data){
//        check if isFull here
        q1.add(data);
        length++;
    }

//    lateral reflection -> if array just reverse array [::-1]
    public int pop(){
        while (q1.size()>0){
            q2.add(q1.remove());
        }
        while (q2.size()!=1){
            q1.add(q2.remove());
        }
        return q2.remove();
//        int data = q1.remove();
//        for (int i=0; i<length-1; ++i){ // leave only one element
//            q2.add(q1.poll());
//        }
//        int poppedElement = q1.poll();
//        length--;
//        for (int i=0; i<length; ++i){
//            q1.add(q2.poll());
//        }
//        return poppedElement;
    }

    @Override
    public int size() {
        return 0;
    }

    public int peek(){
        for (int i=0; i<length-1; ++i){ // leave only one element
            q2.add(q1.poll());
        }
        int top = q1.poll();
        for (int i=0;i<length; i++){
            q1.add(q2.poll());
        }
        return top;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public boolean isFull(){
        return q1.size() == size;
    }

    public void display(){
        String s = q1.toString();
        StringBuffer sbr = new StringBuffer(s.substring(1, s.length()-1));
        System.out.print("["+sbr.reverse()+"]");
    }

}
