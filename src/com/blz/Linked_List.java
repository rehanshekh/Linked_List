package com.blz;

public class Linked_List {
    Node Head;
    Node Tail;

    void add(int data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = newNode;
        } else {
            newNode.next = Head;
            Head = newNode;
        }
    }

    void last(int data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = newNode;
            Tail = newNode;
        } else {
            Tail.next = newNode;
            Tail = newNode;
        }
    }

    void insert (int data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = newNode;
        } else {
            if (Tail == null) {
                Tail = newNode;
            } else {
                newNode.next = Tail;
                Head.next = newNode;
            }
        }
    }

    public void display() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.key + "->");
            temp = temp.next;
        }
        System.out.print(temp);
    }

    void deleteFirst() {
        Head = Head.next;
    }

    void deleteLast() {
        Node temp = Head;
        Node secondLast = null;
        while (temp.next != null) {
            secondLast = temp;
            temp = temp.next;
        }
        secondLast.next = null;
    }

    public Node search(int data) {
        Node temp = Head;
        while (temp != null) {
            if (temp.key==(data)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    void insert(int prevNum, int findNum) {
        Node newNode = new Node((findNum));
        Node searchnode = this.search(prevNum);
        if (searchnode != null) {
            Node temp = searchnode.next;
            searchnode.next = newNode;
            newNode.next = temp;
        }
    }

    void delete(int search, int data) {
        Node newNode = new Node(data);
        Node searchNode1 = this.search(search);
        Node searchNode2 = this.search(data);
        if (searchNode1 != null) {
            searchNode1.next = searchNode2.next;
        }
    }


}
