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

    public void pop()
    {
        if (currentIndex == 0)
        {
            System.out.println("There are no items in your Stack.");
        } else
        {
            stack[currentIndex] = null;
            currentIndex--;
        }
    }

    public String getLength()
    {
        if (currentIndex==0)
        {
            return "There are no items in your Stack.";

        }
        return Integer.toString(currentIndex);

    }

    @Override
    public String toString()
    {
        String[] rtnArr = new String[currentIndex];
        for (int i=0; i<currentIndex; i++)
        {
            rtnArr[i] = stack[i];
        }
        return Arrays.toString(rtnArr);
    }
}
