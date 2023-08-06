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

    public void peek() {
        /*
         * Peek returns the top item but does not remove it.
         * First Element is popped and pushed to the same linkedList.
         */
        Integer peekedData = (Integer) linkedList.pop();
        System.out.println("Peek Element is "+peekedData);
        linkedList.add((T) peekedData);

    }

    public T pop() {
        return linkedList.pop();
    }
}
