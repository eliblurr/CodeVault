package org.example.queue;

public class CustomQueue implements Queue {
    private int arr[];
    int front, rear, size;

    public CustomQueue(int size) {
        arr = new int[size];
        this.size = size;
        front = -1;
        rear = -1;
    }

    public boolean isFull() {
        if(front == 0 && rear==size-1){
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (front == -1){
            return true;
        }
        return false;
    }

    public int peek(){
        if(isEmpty()){
            System.exit(1);
        }
        return arr[front];
    }

    public void enQueue(int data){
        if(isFull()){
            System.out.println("Enqueue exit "+data);
            System.exit(1);
        } else {
            if (front == -1)
                front = 0;
            arr[++rear] = data;
        }
    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("Dequeue exit");
            System.exit(1);
        }

        int elem = arr[front];
        if (front >= rear){
            rear = -1;
            front = -1;
        } else {
            front++;
        }

        return elem;

    }
}
