package myq;

public class myqueue
{
	int rear;
	int front;
	Book[]arr;
	int size;
	public myqueue()
	{
	front=rear=-1;
	size=5;

	}
	public myqueue(int size)
	{
	this.size=size;
	arr= new Book [size];
	front=rear=-1;

	}
	public void enqueue(Book data)
	{
	if (!isfull())
	{
	if (front==-1)
	front=0;
	arr[++rear]=data;
	}
	else
	System.out.println("stack is full");
	}
	public boolean isfull()
	{
	return rear==size-1;
	}
	public boolean isempty()
	{
	return front==-1;
	}
	public void display()
	{
	if(!isempty())
	{
	for(int i=0;i<=rear;i++)
	System.out.println(arr[i]);
	}
	}
	public Book deQue()
	{    Book data=null;
		if(! isempty())
		{
	        data= arr[front];
			 if(front==rear)
			 front=rear=-1;
		
		else
		
			front++;
		}
		return data;
	}

	}

