package assignment.queuestack;

public class Stack {
	
	public int MaxSize;
	public int[] stackArray;
	public int top;	
	
	public Stack (int s)
	{
		MaxSize = s;
		stackArray = new int[MaxSize];
		top = -1 ; 
	}
	public void push (int j)
	{if(top<MaxSize)
	{
		stackArray[++top] = j;
	}
	else
	{
		System.out.println("The Maximum size allowed is "+ MaxSize);
	}
	}
	
	public int pop ()
	{
		return stackArray[top--];		
	}
	
	public boolean isempty()
	{
		return (top == -1);
	}
	}	
