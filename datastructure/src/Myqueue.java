
public class Myqueue
{
	
		int rear,front,size;
		int arr[];
		
	public Myqueue()
	{
		rear=front=-1;
		size=5;
		arr=new int[5];
	}
	public Myqueue(int s)
	{
		rear=front=-1;
		size=s;
		arr=new int[5];
	}
	public void enqueue( int data)
	{
		if(!isfull())
		{
			if(front==-1)
		     front=0;
		     rear++;
		arr[rear]=data;
		}
		else
			System.out.println("queue is full");
	}
	public int dequeue()
	{ int data=0;
		if(!isempty())
		
			data=arr[front];
			if(front==rear)
				front=rear=-1;
			else front++;
		
			return data;

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
		if(isempty())
		{
			System.out.println("queue is empty");
			return;
		}
		for(int i=front;i<=rear;i++)
		{
			System.out.println(arr[i]);
		}
	}

	}

	