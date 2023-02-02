package class_3;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args)
	{
		Myqueue q=new Myqueue(5);
		String arr[]=new String [5];
	  Scanner sc= new Scanner(System.in) ;
	  System.out.println("enter the string");
	  for (int i=0;i<=arr.length-1;i++)
	  {
	  arr[i]=sc.next();
		q.Enque(arr[i]);	

	}
	  q.display();
	}

}
