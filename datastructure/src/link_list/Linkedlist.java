package link_list;

public class Linkedlist 
{
Node head;

public Linkedlist()
{
	head=null;
}
 public void addnode(int data)
 {
	Node move=null;
	Node n1 =new Node (data);
	if(head==null)
	
		head=n1;
		
	else
	{
	   move=head;
    while(move.next!=null)
       move=move.next;
       move.next=n1;
	} 
 }
public void lastnode(int data)
	{ Node nl=new Node(data);
		Node move;
		move=head;
		if(head==null)
			head=nl;
		else
		{
			while(move.next!=null)
			move=move.next;
		    move.next=nl; 	
		}
	}
public void atposition(int position,int data)
		{
			Node record=new Node(data);
			Node move=head;
			for(int i=1;i<position-1;i++)
			
				move=move.next;
				
			record.next=move.next;
			move.next=record;
		}
		
 public void begnode(int data)
  {  Node nbeg=new Node(data);
	  if(head==null)
		  head=nbeg;
	  else
		  nbeg.next=head;
	      head=nbeg;
  }
 public void begdlt()
 {
	 Node del;
	 del=head;
	 head=head.next;
	 del=null;
 }
 public void printfirst()
 {
	 System.out.println("first element is:"+head.data);
 }
 public void printlast()
 {
	 Node move=head;
	 while(move.next!=null)
		 move=move.next;
	 System.out.println("last node is"+move.data);
 }
 public void display()
  {   Node move;
	  if(head==null)
	  {
		System.out.println("no linke list");
		return;
	  }
	  for(move=head;move!=null;move=move.next)
	  
		  System.out.println(move.data);
	  
  }
 public int findmax()
 {
	 int max=head.data;
	 Node move;
	 move=head;
	for(;move!=null;move=move.next)
	{
		if(max<move.data)
			max=move.data;
	}
	return max;
	 
 }
 public int findmin()
 {
	 int min= head.data;
	 Node move;
	 move=head;
	for(;move!=null;move=move.next)
	{
		if(min>move.data)
			min=move.data;
	}
	return min;
	 
 }
 
}