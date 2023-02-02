
public class CQueue 
{
	 int front ,rear,size;
	    int arr[];
	    
	    public CQueue()
	    {
	    	front=rear=-1;
	    	size=5;
	    	arr=new int [size];
	    }

		public CQueue(int size)
		{
			front=rear=-1;
			this.size = size;
			arr=new int [size];
		}
		public void enqueue(int d)
		{
		if(!isfull()) 
		{
		
			if(front==-1)
				front=0;
			rear=(rear+1)%size;
			arr[rear]=d;
		}
		else 
			System.out.println("cqueue is full");
		}
		public int dequeue()
		{
			int data=0;
			if(!isempty())
			{
				data=arr[front];
				if(front==rear)
					front=rear=-1;
				else
					front=(front+1)%size;
			}
			return data;
		}
		
		public boolean isfull()
		{
			return front==(rear+1)%size;
		}
		
		public boolean isempty()
		{
			return front==-1;
		}
		
	    public void display()
	    {   int i;
	    	if(isempty()) {
	    		System.out.println("cqueue empty");
	    	return;}
	    	for( i=front;i!=rear;i=(i+1)%size)
	    	{
	    		System.out.println(arr[i]);
	    	}
	    	if(i==rear)
	    		System.out.println(arr[i]);
	    }
	}

