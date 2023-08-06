package com.linkedlistdatastructure.queue;

import com.linkedlistdatastructure.LinkedList;

public class Queue <T extends Comparable<T>>{

    //Creates LinkedList Object
    LinkedList<T> linkedList = new LinkedList<T>();

    public void enqueue(T data) {
        linkedList.append(data);
    }

    public void display() {
        linkedList.display();
    }
}
