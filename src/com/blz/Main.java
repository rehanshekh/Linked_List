package com.blz;

public class Main {
    public static void main(String[] args) {
        var newList  =new Linked_List();
        newList.add(56);
        newList.last(30);
        newList.last(70);
        newList.insert(30,40);
        newList.delete(30,40);
        newList.display();
        Sorted_Linked_List myList = new Sorted_Linked_List();
        myList.add(56);
        myList.add(30);
        myList.add(70);
        myList.add(40);
        myList.add(1);
        myList.add(35);
        myList.add(80);
        myList.add(0);

        myList.display();

    }
}
