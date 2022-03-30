package com.structure;

public class MyLinkedList<K, V> {
    MyMapNode<K, V> Head;
    MyMapNode<K, V> Tail;

    public MyMapNode<K, V> search(K key) {
        MyMapNode<K, V> tempNode = Head;
        while (tempNode != null && tempNode.getNext() != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }

    public void append(MyMapNode<K, V> myNode) {
        if (Head == null) {
            Head = myNode;
        }
        if (Tail==null){
            Tail=myNode;
        }else {
            Tail.setNext(myNode);
            Tail=myNode;
        }
    }

    @Override
    public String toString() {
        return
                "Head=" + Head +
                '}';
    }
}
