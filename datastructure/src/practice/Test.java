package practice;

import java.util.Scanner;

public class Test {

	public static void main(String[] args)
	{
		Linkedlist l1=new Linkedlist();
		int data;
		int ch,p;
		Scanner sc=new Scanner (System.in);
		System.out.println("1. addnode  2.  display 3.begnode 4. lastnode 5.add node at position 6.delete first 7. print first node 8.print last node ,9.exit");
		do {
			System.out.println("enter your choice");
			 ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("enter the data");
				data=sc.nextInt();
				l1.addnode(data);
				break;
				
			case 2:
				l1.display();
				break;
			case 3:
				System.out.println("enter the data");
				data=sc.nextInt();
				l1.begnode(data);
				break;
			case 4:
				System.out.println("enter the data");
				data=sc.nextInt();
				l1.lastnode(data);
				break;
		 case 5:
				System.out.println("enter the position");
				p=sc.nextInt();
				System.out.println("enter the data");
				data=sc.nextInt();
				l1.atposition(p, data);
				break;
		 case 6 : l1.begdlt();
		          break;
		 case 7: l1.printfirst();
		          break;
		 case 8:l1.printlast();
		        break;
			
		  case 9: 
		         System.out.println(l1.findmax());
		         break;
		         
		  case 10:
			  System.out.println(l1.findmin());
			  break;
		  case 11:
			  l1.sortlist();
			  break;
			}  
		}	
		while(ch!=0);
		
	}

}
