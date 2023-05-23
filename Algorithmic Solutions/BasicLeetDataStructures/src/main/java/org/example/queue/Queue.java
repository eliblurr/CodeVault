package org.example.queue;

public interface Queue<T>{
    public Boolean isFull();
    public Boolean isEmpty();
    public T peek();
    public T deQueue();
    public void enQueue(T i);
    public Integer size();
}
