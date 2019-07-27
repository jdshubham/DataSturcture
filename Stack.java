package com.bridgelabz.datastructure;

public class Stack 
{
	static int capacity = 5;

	private char[] stack = new char[capacity];

	private int top = 0;
	
	public void push(char data)
	{
		if (top == capacity)
		{
			System.out.println("Stack is full");
		}
		stack[top] = data;
		top++;
	}
	
	public  char pop()
	{
		if (isEmpty())
		{
			System.err.println("cant pop , stack is empty");
			return 0;
		} 
		else
		{
			char data =  stack[--top];
			stack[top] = 0 ;
			return data;
		}
	}
	
	public  char peek() 
	{
		return  stack[top];
	}
	
	public boolean isEmpty() 
	{
		return top == 0;
	}
	
	public int size()
	{
		return top;
	}	
}