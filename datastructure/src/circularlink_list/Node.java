package circularlink_list;

public class Node 
{ Node next;
int data;
public Node()
{
	next=null;
}
public Node (int data)
{
	this.data=data;
	next=null;
}
public  String toString()

{
	return ""+data;
}

}
