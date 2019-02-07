package com.vucao;

import java.util.Arrays;

public class Stack
{
    private String[] stack = new String[1000];
    private int currentIndex = 0;

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

    @Override
    public String toString()
    {
        return Arrays.toString(stack);
    }
}
