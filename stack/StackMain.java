package com.linkedlistdatastructure.stack;

public class StackMain {
    public static void main(String[] args) {
        //UC1: Create a Stack of 56->30->70.
        Stack <Integer> stack = new Stack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.display();

        //UC2: Ability to Peak and Pop from the Stack till it is Empty.
        System.out.println();
        stack.peek();
        stack.display();


    }
}
