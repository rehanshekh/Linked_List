package com.blz;

public class Sorted_Linked_List<K extends Comparable<K>> {
    public Node<K> Head;

    void add(Node<K> newNode) {
        insert(newNode);
    }

    public void insert(Node<K> info) {
        if ((Head == null) || (info.compareTo(Head) < 0)) {
            info.next = (Head);
            Head = info;
        } else {
            Node<K> current = Head;
            while ((current.next != null) && (info.compareTo(current.next) > 0)) {
                current = current.next;
            }
            if (current.next == null) {
                current.next = info;
            }
            if (info.compareTo(current.next) < 0) {
                info.next = current.next;
                current.next = info;
            }
        }
    }

    public void display() {
        System.out.println();
        Node<K> temp = Head;
        while (temp.next != null) {
            System.out.print(temp.key + "->");
            temp = temp.next;
        }
        System.out.print(temp.key);
    }

}
