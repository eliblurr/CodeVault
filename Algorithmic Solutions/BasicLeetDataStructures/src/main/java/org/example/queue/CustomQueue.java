package org.example.queue;

public class CustomQueue<T> implements Queue<T> {
    private T arr[];
    private int front, rear, size, count;

    public CustomQueue(int size) {
        arr = (T[]) new Object[size];;
        this.size = size;
        front = -1;
        rear = -1;
        count = 0;
    }

    public Boolean isFull() {
        return front == 0 && rear==size-1;
    }

    public Boolean isEmpty() {
        return front == -1;
    }

    public T peek(){
        if(isEmpty()) throw new ArrayIndexOutOfBoundsException("Failed to peek! Queue is empty");
        return arr[front];
    }

    public void enQueue(T data){
        if(isFull()) throw new RuntimeException("Failed to push into a full stack");
        if (front == -1)
            front = 0;
        arr[++rear] = data;
        count++;
    }

    @Override
    public Integer size() {
        return count;
    }

    public T deQueue(){
        if(isEmpty()) throw new ArrayIndexOutOfBoundsException("Failed to deQueue! Queue is empty");
        T elem = arr[front];
        if (front >= rear){
            rear = -1;
            front = -1;
        } else {
            front++;
        }
        count--;
        return elem;
    }
}
