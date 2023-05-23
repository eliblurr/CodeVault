package org.example.stack;

public interface Stack<T> {
    public void push(T i);
    public T pop();
    public Integer size();
    public Boolean isFull();
    public Boolean isEmpty();
    public void display();
}
