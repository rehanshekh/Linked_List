package com.stack;

public class Stack {
    public static void main(String[] args){
        var mylist  = new Linked_List<>();
        mylist.push(70);
        mylist.push(30);
        mylist.push(56);
        mylist.print();
        mylist.pop();
        mylist.peek();
    }
}
