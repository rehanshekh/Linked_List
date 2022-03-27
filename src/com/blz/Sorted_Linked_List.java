package com.blz;

public class Sorted_Linked_List {
    Node Head;
    Node Replace;

    public void add(int data) {
        Node newNode = new Node(data);
        addSort(newNode);
    }
        public void addSort(Node newNode){
        if (Head == null) {
            Head = newNode;
        } else {
            if (Head.key > newNode.key) {
                newNode.next = Head;
                Head = newNode;
            } else {
                Node temp = Head;
                while ((temp.key < newNode.key) && (temp.next != null)) {
                    Replace = temp;
                    temp = temp.next;
                }if (newNode.key<temp.key){
                    Replace.next = newNode;
                    newNode.next = temp;
                }else if(temp.next == null){
                 temp.next=newNode;
                }
            }
        }
    }

    public void display() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.key + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
}
