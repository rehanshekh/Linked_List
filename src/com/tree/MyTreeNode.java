package com.tree;

public class MyTreeNode<K> {
    K key;
    MyTreeNode<K> left;
    MyTreeNode<K> right;

    public MyTreeNode(K data) {
        this.key = data;
        this.left = null;
        this.right = null;
    }
}
