package com.stack;

public class Linked_List<T> {
    Node<T> Head;

    void push(int data) {
        Node<T> newNode = new Node(data);
        if (Head == null) {
            Head = newNode;
        } else {
            newNode.next = Head;
            Head = newNode;
        }
    }

    void print() {
        Node<? extends T> temp = Head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    T pop() {
        T pop =  Head.data;
        Head = Head.next;
        return pop;
    }void peek(){
        T show = pop();
        System.out.println(show);
    }
}
