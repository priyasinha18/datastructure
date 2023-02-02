package datastructure;

public class Mystack
{
int top;
int size;
int arr[];
public Mystack()
{
	size=5;
	top=-1;
	arr=new int[size];
}
public Mystack(int size)
{
	this.size=size;
	top=-1;
	arr=new int [size];
}
public void push(int data)
{
	if(!isfull())
	{
		arr[++top]=data;
    }
	else 
		System.out.println("stack is full");
}
public int pop()
{ int data=-9999;
	if(! isempty())
   data=arr[top--];
	return data;
	}
public boolean isfull()
{
	if(top==size-1)
		return true;
	else 
		return false;
}
public boolean  isempty()
{
	return top==-1;
}
public void display()
{
	if(isempty())
	{
		System.out.println("empty");
		return;
	}
	for(int i=top;i>=0;i--)
		System.out.println(arr[i]);
}
}
