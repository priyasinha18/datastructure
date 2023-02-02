package class_3;

public class Myqueue 
{
	int rear;
	int front;
	String arr[];
	int size;
	public Myqueue() 
	{
      rear=-1;
      front=-1;
      size=5;
      arr= new String[size];
  
	}
	public Myqueue(int size)
	{
	
		this.size = size;
		rear=-1;
		front=-1;
		arr=new String[size];
	}
	public void Enque(String arr2)
	{
		if(! isfull())
		{ if(front ==-1)
			front=0;
			rear++;
		arr[rear]=arr2;
		}
		else
			System.out.println("stack is full");
	}
	public String deQue()
	{    String data=null;
		if(! isEmpty())
		{
	        data= arr[front];
			 if(front==rear)
			 front=rear=-1;
		
		else
		
			front++;
		}
		return data;
	}
	public boolean isfull()
	{
		if(rear==(size-1)) 
			
		
			return true;
		else 
			return false;
		
	}
	public boolean isEmpty()
	{
		if(front ==-1)
			return true;
		else 
			return false;
	}
	public void display()
	{
		System.out.println("front is***"+front);
		for (int i=front;i<=rear;i++)
			System.out.println(arr[i]);
		System.out.println("rear value is"+rear);
	}
	

}
