package myq;

public class Book {
	 int bookid;
	 String bname;
	  String author;
	public Book()
	{

	}
	public Book( int bookid,String bname,String author)
	{
	this.bookid=bookid;
	this.bname=bname;
	this.author=author;
	}
	public String toString()
	{
	return bookid+","+bname+","+author;
	}

}
