import java.util.Scanner;

public class Qtest
{

	public static void fixedsize(int data)
	{
		CQueue cq=new CQueue(5);
		if(!cq.isfull())
		{
			cq.enqueue(data);
		}
		else 
		{
			cq.dequeue();
			cq.enqueue(data);
			System.out.println("***********");
			cq.display();
		}
		System.out.println("all elements are");
		cq.display();
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int size;
	int arr[];
	System.out.println("enter the size");
	size=sc.nextInt();
	arr=new int[size];
	System.out.println("enter the element");
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
		
        fixedsize(arr[i]);
	
	}

}
}
