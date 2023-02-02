package charstack;

public class Mystack
{
int size;
int top;
char arr[];
public Mystack()
{
	top=-1;
	size=5;
}
public Mystack(int size)
{
	this.size=size;
	top=-1;
	arr=new char [size];
}
public void push(char data)
{
	if(!isfull())
		arr[++top]=data;
	else
		System.out.println("stack is full");
}
public char pop()
{
	char data='.';
	
	if(!isempty())
	{
	data=arr[top--];
	}
	return data;
	
}
public boolean isempty()
{
	return top==-1;
}
public boolean isfull()
{
	return top==size-1;
}
public void display()
{
	for(int i=top;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
	System.out.println("**********************");

}
}
