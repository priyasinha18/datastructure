package stack;

import java.util.Scanner;

public class Main 
{
	public static void main(String []args) 
	{
	StackInt first=new StackInt();
	StackInt second=new StackInt();
	int choice;
	Scanner sc = new Scanner (System.in);
	do
	{
		System.out.println("Enter your choice");
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("\t\t1: Enter value\t\t2: Delete value\t\t3: Display\t\t0: EXIT");
		System.out.println("-------------------------------------------------------------------------------------------------");
		choice = sc.nextInt();
		switch (choice)
		{
		case 1:
			{
				if(!first.isFull())
				{
					System.out.println("Enter Number");
					while(!first.isEmpty())
					{
						second.push(first.pop());
					}
					first.push(sc.nextInt());
					while (!second.isEmpty())
					{
						first.push(second.pop());
					}
				}
				else
				{
					System.out.println("--------QUEUE IS FULL--------");
				}
				break;
			}
		case 2:
			{
				int data = first.pop();
				if(data != -999999)
				{
					System.out.println("Deleted : "+data);
				}
				break;
			}
		case 3:
			{
				first.display();
				break;
			}
		default:
			{
				System.out.println("invalid choice");
				break;
			}
		}
	}while (choice!=0);
	sc.close();
}

}
