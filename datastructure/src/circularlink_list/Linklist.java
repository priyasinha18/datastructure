package circularlink_list;

public class Linklist 
{   
	Node head;
public Linklist()
{
	head=null;
	
}
public void add(int data)
{ 
	Node n1=new Node(data);
      Node move=head;
	if(head==null)
	{   head=n1;
		n1.next=head;
	}
	else {
		while(move.next!=head)
		move=move.next;
		move.next=n1;
		n1.next=head;
	    }
}
public void insert(int p,int data)
{
	Node n1=new Node(data);
	Node move=head;
	if (p==1)
	{
		head=n1;
		n1.next=head;
	}
	for(int i=1;i<p-1;i++)
	
		move=move.next;
	n1.next=move.next;
	move.next=n1;
}
public void display()
{       Node move=head;
while(move.next!=head)
{
	System.out.println(move.data);
	move=move.next;
}
System.out.println(move.data);
}


}
