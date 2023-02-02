import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		CQueue cq=new CQueue(5);
		int[]arr=new int[9];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the ele");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
	
			 if(!cq.isfull()) 
			{
			cq.enqueue(arr[i]);
		
			}
		
			 else 
			 {
			 cq.dequeue();
			 cq.enqueue(arr[i]);
			 System.out.println("............");
			 cq.display();}
		}
		
		System.out.println("total elements ");
		cq.display();
		
	}

	}


