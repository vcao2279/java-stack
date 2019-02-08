package com.vucao;

public class Main
{
    public static void main (String[] args)
    {
        MyStack myStack = new MyStack();
        System.out.println(myStack.getLength());

        myStack.push("first");
        myStack.push("second");
        myStack.push("third");
        System.out.println(myStack.getLength());

        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);
        System.out.println(myStack.getLength());
    }
}
