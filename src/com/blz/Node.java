package com.blz;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
    T key;
    Node<T> next;

    Node(T key) {
        this.key = key;
        this.next = null;
    }


    @Override
    public int compareTo(Node<T> other) {
        return key.compareTo(other.key);
    }
}
