package org.example.linkedList;

public class LinkedList {

    public Node head;

    public static class Node{
        public Node next;
        public int data;

        public Node(int data){
            this.data = data;
            next = null;
        }

    }

}
