package graph_DFS_V1;

public class Stack {
	public int size = 20;
	public int[] st;
	public int top;
	
	public Stack()
	{
		st = new int [size];
		top = -1;
	}
	
	public void push(int j)
	
	{
		st[++top] = j;
	}
	
	public int pop()
	
	{
		return st[top--];
	}
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public int getTop()
	{
		return st[top];
	}
}


 