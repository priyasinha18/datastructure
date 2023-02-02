package practice;

public class Cqueue 
{
	
	
	int rear,front,size;
	int arr[];
	public Cqueue()
	{
	rear=front=-1;
	size=5;
	arr=new int [size];
	}

	public Cqueue(int size)
	{
	this.size=size;
	arr=new int[size];
	rear=front=-1;
	}
	public void enqueue(int data)
	{
	if(!isfull())
	{
	if(front==-1)
	front=0;
	rear=(rear+1)%size;
	arr[rear]=data;
	}
	else
	System.out.println("queue is full");
	}
	public int dequeue()
{
	
	int data=0;
	if(!isEmpty())
	{
	data=arr[front];
	if(front==rear)
	front=rear=-1;
	
	else
	front=(front+1)%size;
	}
	return data;
}

	public boolean isEmpty()
	{
	return front==-1;
	}
	public boolean isfull()
	{
	return front==(rear+1)%size;
	}
	public void dispay()
{ int i;
	if(isEmpty())
	{
	System .out.println("quee is empty");
	return;
	}
	
	
	for( i=front;i!=rear;i=(i+1)%size)
	{
	System.out.println(arr[i]);
	}
	if (i==rear)
	System.out.println(arr[i]);
	
	}
	 

}
