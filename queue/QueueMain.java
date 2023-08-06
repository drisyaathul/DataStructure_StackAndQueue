package com.linkedlistdatastructure.queue;

public class QueueMain {
    public static void main(String[] args) {
        //UC1: Create a Queue of 56,30,70.
        Queue <Integer> queue = new Queue<>();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        queue.display();
    }
}
