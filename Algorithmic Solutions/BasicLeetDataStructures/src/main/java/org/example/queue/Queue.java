package org.example.queue;

public interface Queue{
    public boolean isFull();
    public boolean isEmpty();
    public int peek();
    public int deQueue();
    public void enQueue(int i);
}
