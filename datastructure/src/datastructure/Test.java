package datastructure;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{  
		Mystack s=new Mystack(5);
		int arr[]=new int [5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
			s.push(arr[i]);
		}
		s.display();

	}

}
