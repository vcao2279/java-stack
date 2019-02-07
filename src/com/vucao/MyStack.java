package com.vucao;

import java.util.Arrays;

public class MyStack
{
    private String[] stack;
    private int currentIndex;

    public MyStack()
    {
        this.stack = new String[1000];
        this.currentIndex = 0;
    }

    public void push(String s)
    {
        if (currentIndex == 1000)
        {
            System.out.println("Stack is full.");
        } else
        {
            stack[currentIndex] = s;
            currentIndex++;
        }
    }


}
