package circularlink_list;

import java.util.Scanner;

public class Test {

	public static void main(String[] args)
	{
		
      Linklist l1=new Linklist();
      int data;
      int ch;
     Scanner sc= new Scanner (System.in);
    
     do {
    	 System.out.println("enter the choice");
          ch= sc.nextInt();
    	 switch(ch)
    	 {
    	 case 1:System.out.println("enter the data");
    	         data=sc.nextInt();
    	         l1.add(data);
    	         break;
    	 case 2:l1.display(); 
    	        break;
    	 case 3: System.out.println("enter the position and data");
    	         int p=sc.nextInt();
    	         data=sc.nextInt();
    	         l1.insert(p, data);
     }
     

	}while(ch!=0);
	}
}
