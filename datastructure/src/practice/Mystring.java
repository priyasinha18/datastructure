package practice;

import java.util.Scanner;

public class Mystring {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the string");
		String str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}

	}

	
}
