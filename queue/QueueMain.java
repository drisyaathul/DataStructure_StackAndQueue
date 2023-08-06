package com.linkedlistdatastructure.queue;

public class QueueMain {
    public static void main(String[] args) {
        //UC1: Create a Queue of 56,30,70.
        Queue <Integer> queue = new Queue<>();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        System.out.println("Enqueue the Queue :- ");
        queue.display();

        //UC2: Ability to Dequeue from the Beginning
        System.out.println();
        System.out.println("\nDequeue the Element From the beginning :-");
        Integer popData;
        do {
            popData = queue.dequeue();
            if (popData == null)
                System.out.println("\n** Queue is Empty ** ");
            else
                System.out.println("\nElement is Popped : "+popData);
            queue.display();
        }
        while (popData != null);
    }
}
