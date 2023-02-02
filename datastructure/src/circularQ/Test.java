package circularQ;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		int arr[]=new int[10];
       Myqueue q=new Myqueue(5);
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the element");
    for(int i=0;i<arr.length;i++)
    {
    arr[i]=sc.nextInt();
    q.enqueue(arr[i]);
	
    q.display();
    }
	}

}
