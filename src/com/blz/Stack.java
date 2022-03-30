package com.blz;

public class Stack<K extends Comparable<K>> {
    Linked_List<K> stackList = new Linked_List<>();

    void push(Node<K> newNode) {
        stackList.add(newNode);
    }

    void print() {
        stackList.display();
    }

    K peekPop() {
        K element = stackList.deleteFirst();
        return element;
    }
}
