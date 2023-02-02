
public class Prime_q 
{
	public static int isprime(int n)
	{  int res=n;
	
		    if(n<=1)
			res=-1;
	for(int i=2;i<=(n/2);i++)
	{
		if(n%i==0)
			{
				res=-1;
		        break;
			}
		
	}       
	      return res;
}


	public static void main(String[] args) {
		{int n=0, res=0;
		Myqueue q=new Myqueue(5);
		for (int i=n;i<20;i++)
		{
			res=isprime(i);
			if(i==res) 
			{
            //System.out.println("all prime no. are: "+res);
		    q.enqueue(res);
		    q.display();
		    System.out.print("all prime no are "+res);
		   
		    }

	}

}
	}
}
