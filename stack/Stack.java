package com.linkedlistdatastructure.stack;

import com.linkedlistdatastructure.LinkedList;

public class Stack <T extends Comparable<T>>{
    //Creates LinkedList Object
    LinkedList<T> linkedList = new LinkedList<T>();

    public void push(T data) {
        /*
        Here push will internally call add method on LinkedList.
         */
        linkedList.add(data);
    }

    public void display() {
        linkedList.display();
    }
}
