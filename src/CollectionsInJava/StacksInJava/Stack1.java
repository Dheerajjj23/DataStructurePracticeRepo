package CollectionsInJava.StacksInJava;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        //Stacks are synchronized
        //Stack works on LIFO (Last In First Out) principle
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push("Dheeraj Joshi");
        stack.add(4,0);
//        stack.remove(4);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.peek();
    }
}
