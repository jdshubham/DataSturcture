package com.bridgelabz.datastructure;

import java.util.Scanner;

public class Parantheses extends Stack
{
	
	static boolean check(String s) throws Exception 
	{
		Stack st = new Stack();
		for (int i = 0; i < s.length(); i++) 
		{
				char c = s.charAt(i);	
				if (c == '(' || c=='{' || c=='[')
				{
					st.push(s.charAt(i));	
				}
				else if (c == ')' || c=='}' || c==']') 
				{	
					st.pop();
				}
		}	
		return st.isEmpty();
		}
	public static void main(String[] args) throws Exception 
	{
		Scanner scanner = new Scanner(System.in);
		String s = " ";
		System.out.println("Enter Parenthesis");
		s = scanner.nextLine();
		String result = (check(s)) ? "Balanced" : "Not Balanced";
		System.out.println(result); 
	}
}

