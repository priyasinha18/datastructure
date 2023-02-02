package myq;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		{
			Scanner sc=new Scanner(System.in);
			Book b1;
			int ch;
			
			myqueue q1=new myqueue(5);

			do{
			System.out.println("enter the choice");
			 ch=sc.nextInt();
			switch(ch)
			  {
			  case 1:System.out.println("enter the value of bid,bname,author");
			         int bid =sc.nextInt();
			         String bname=sc.next();
			         String author=sc.next();
			         b1=new Book(bid,bname,author);
			         q1.enqueue(b1);
			         break;
			   case 2:q1.display();
			   break;
			        
			   }
			}while(ch!=0);
			}
	}

}
