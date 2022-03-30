package com.blz;

public class Queue<K extends Comparable<K>> {
    Linked_List<K> queueList = new Linked_List<>();

    void enqueue(Node<K> newNode) {
        queueList.last(newNode);
    }

    K dequeue() {
        K element= queueList.deleteFirst();
    return element;}

    void printQueue() {
        queueList.display();
    }
}
