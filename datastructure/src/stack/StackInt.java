package stack;

public class StackInt 
{
	private int arr [];
	private int size;
	private int top;
	public StackInt() {
		super();
		size = 5;
		top = -1;
		arr = new int [size];
	}
	
	public StackInt (int size)
	{
		this.size=size;
		top = -1;
		arr = new int [size];
		
	}
	
	public boolean isFull()
	{
		if (top==size-1)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty()
	{
		if (top==-1)
			return true;
		else
			return false;
	}
	
	public void push(int num)
	{
		if (!isFull())
			{
				arr[++top]=num;
			}
		else
			{
				System.out.println("Stack is full...");
			}
	}
	
	public int pop ()
	{
		int data = -999999;
		if (!isEmpty())
		{
			data = arr[top--];
		}
		return data;
	}
	
	public int peek()
	{
		int data = -999999;
		if (!isEmpty())
		{
			data = arr[top];
		}
		return data;
	}
	
	public void display()
	{
		if(!isEmpty())
		{
			System.out.println("---------------STACK--------------");
			for (int i= top; i>=0; i--)
			{
				System.out.println(arr[i]);
			}
		}
	}
}

