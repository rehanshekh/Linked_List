package com.blz;



public class Main {
    public static void main(String[] args) {
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        Node<Integer> fourthNode = new Node<>(40);
        Node<Integer> fifthNode = new Node<>(99);
        Linked_List<Integer> newList = new Linked_List<>();

              newList.add(firstNode);
            newList.add(secondNode);
          newList.add(thirdNode);
        newList.last(thirdNode);
        newList.last(firstNode);
        newList.display();
        newList.insert(secondNode);
        newList.display();
        newList.insertAfter(30,fourthNode);
        newList.display();
        newList.delete(40);
        newList.display();
        newList.deleteFirst();
        newList.display();
        newList.deleteLast();
        newList.display();
        System.out.println();
        Node<Integer> searchedNode = newList.search(30);
        System.out.println(searchedNode);
        newList.display();
Sorted_Linked_List<Integer> myList = new Sorted_Linked_List<>();
        myList.add(firstNode);
        myList.add(secondNode);
        myList.add(thirdNode);
        myList.add(fourthNode);
        myList.add(fifthNode);
        myList.display();
        Stack<Integer> stack = new Stack<>();
        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);
        stack.print();
        int element = stack.peekPop();
        System.out.println();
        System.out.println(element);
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(thirdNode);
        queue.enqueue(secondNode);
        queue.enqueue(firstNode);
        System.out.println(queue.dequeue());
        queue.printQueue();


    }
}
