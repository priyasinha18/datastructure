package charstack;

import java.util.Scanner;

public class Paranthesis {

	public static void main(String[] args) 
	{
		
       Scanner sc=new Scanner (System.in);
       System.out.println("enter the peranthesis"); 
       String data=sc.next();
       Mystack s1=new Mystack(data.length());
       boolean flag=true;
       for(int i=0;i<data.length();i++)
       { char ch;
    	   if(data.charAt(i)=='('||data.charAt(i)=='{'||data.charAt(i)=='[')
    		  s1. push(data.charAt(i));
    	   else
    		   
    	   
    		   {
  				 ch = s1.pop();
  				 if(ch=='{' && data.charAt(i)!='}' || ch=='(' && data.charAt(i)!=')' || ch=='[' && data.charAt(i)!=']')
  				 {
  					 flag = false;
  					 break;
  				 }
  					 
  			
  		     }
       }
  		if (flag == true)
  		{
  			System.out.println("Balanced String "+ data);
  		}
  		else
  		{
  			System.out.println("String is not Balanced");
  		}
       
	}

}
