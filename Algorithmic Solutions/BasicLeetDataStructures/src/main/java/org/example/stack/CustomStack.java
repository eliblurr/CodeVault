package org.example.stack;

public class CustomStack implements Stack {

    private int arr[];
    private int top;
    private int size;

    public CustomStack(int size){
        arr = new int[size];
        this.size = size;
        top = -1;
    }

    public int size(){
        return top+1;
    }

    public boolean isFull(){
        return top == size-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    @Override
    public void display() {
        System.out.print(arr.toString());
    }

    public void push(int data){
        if(isFull()){
            System.out.println("failed stack is full");
            System.exit(1);
        }
        arr[++top] = data;
    }

    public int pop(){
        return arr[top--];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("failed stack is empty");
            System.exit(1);
        }
        return arr[top];
    }

}
