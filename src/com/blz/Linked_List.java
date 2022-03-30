package com.blz;

public class Linked_List<K extends Comparable<K>> {
    public Node<K> Head;
    public Node<K> Tail;
    int size;

    void add(Node<K> newNode) {
        if (Head == null) {
            Tail = newNode;
            Head = newNode;
        } else {
            newNode.next = Head;
            Head = newNode;
        }
    }

    void last(Node<K> newNode) {
        if (Head == null) {
            Head = newNode;
        }
        if (Tail == null) {
            Tail = newNode;
        } else {
            Tail.next = (newNode);
            Tail = newNode;
        }
    }


    void insert(Node<K> newNode) {
        if (Head == null) {
            Head = newNode;
        } else {
            if (Tail == null) {
                Tail = newNode;
            } else {
                Head.next = (newNode);
                newNode.next = (Tail);

            }
        }
    }

    public void display() {
        System.out.println();
        Node<K> temp = Head;
        while (temp.next != null) {
            size++;
            System.out.print(temp.key + "->");
            temp = temp.next;
        }
        System.out.print(temp.key);
    }


    K deleteFirst() {
        if (Head != null) {
            Node<K> element = Head;
            Head = Head.next;
            return element.key;
        }
        return null;
    }

    void deleteLast() {
        Node<K> temp = Head;
        while (temp.next != Tail) {

            temp = temp.next;
        }

        temp.next = (null);

    }


    public Node<K> search(K data) {
        Node<K> temp = Head;
        while (temp != null) {
            if (temp.key.equals(data)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }


    void insertAfter(K searchNumber, Node<K> newNode) {
        Node<K> searchNode = this.search(searchNumber);
        if (searchNode != null) {
            Node<K> temp = searchNode.next;
            searchNode.next = newNode;
            newNode.next = temp;
        }
    }

    void delete(K deleteNode) {
        Node<K> replace = new Node<>(deleteNode);
        Node<K> searchNode = this.search(deleteNode);
        Node<K> temp = Head;
        while (temp != searchNode) {
            replace = temp;
            temp = temp.next;
        }
        replace.next = searchNode.next;
    }


}


