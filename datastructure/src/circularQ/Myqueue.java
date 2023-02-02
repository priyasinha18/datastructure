package circularQ;

public class Myqueue
{
 int rear, front, size;
 int arr[];
 public Myqueue()
 {
	 size=5;
	 rear=front=-1;
	 arr=new int [size];
 }
 public Myqueue( int s)
 {
	 size=s;
	 rear=front=-1;
	 arr=new int [size];
	 
 }
 public void enqueue(int data)
 {
	 if(!isfull())
	 {
	 
		 if(front==-1) 
		 
		 
			front=0;rear=(rear+1)%size; 
		    arr[rear]=data;
	 }
		 
		 else
			 System.out.println("is full");
	  }
 public int dequeue()
 { int data=0;
	 if(!isempty())
		 data=arr[front];
	 if(front==rear)
		 front=rear=-1;
	 else
		 front=(front+1)% size;
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
 {
	 int i;
	 if(isempty())
	 {
		 System.out.println("queue is empty");
		 return;
	 }
	 System.out.println("front:"+front);
	 for(i=front;i!=rear;i=(i+1)%size)
	 {
		 System.out.println(arr[i]);
		 if(i==rear)
			 System.out.println(arr[i]);
           System.out.println("rear:"+rear);	
	 }
 }
}
