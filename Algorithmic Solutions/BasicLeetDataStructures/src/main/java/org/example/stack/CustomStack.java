package org.example.stack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CustomStack<T> implements Stack<T> {

    private T arr[];
    private Integer top;
    private Integer size;

    public CustomStack(int size){
        this.arr = (T[]) new Object[size];
        this.size = size;
        top = -1;
    }

    public Integer size(){
        return top+1;
    }

    public Boolean isFull(){
        return top == size-1;
    }

    public Boolean isEmpty(){
        return top == -1;
    }

    @Override
    public void display() {
        System.out.print(arr.toString());
    }

    public void push(T data){
        if(isFull()) throw new RuntimeException("Failed to push into a full stack");
        arr[++top] = data;
    }

    public T pop(){
        if(isEmpty()) throw new ArrayIndexOutOfBoundsException("Failed to pop! Stack is empty");
        return arr[top--];
    }

    public T peek(){
        if(isEmpty()){
            System.out.println("failed stack is empty");
            System.exit(1);
        }
        return arr[top];
    }

}
