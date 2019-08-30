import java.util.*;
class Book
{
	int price;
	int pages;
	String name,author,g;
	Book()
	{	
		name="\0";
		author="\0";
		price=0;
		pages=0;
	}
	void input(String n,String a,int p,int pg)
	{	
		name=n;
		author=a;
		price=p;
		pages=pg;
	}
	String ToString()
	{
		String s="Name:"+name+"\nAuthor:"+author+"\nprice:"+price+"\nTotal_pages:"+pages;
		return s;
	}
	void getdata()
	{
		g=ToString();
		System.out.println("*********************************************");
		System.out.println("Book Details:\n"+g);
		System.out.println("*********************************************");	
	}
}
class Bookdemo
{
	public static void main(String args[])
	{
		int i,p,pg,x;
		String n,a,sr;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of Books:");
		x=s.nextInt();
		Book b[]=new Book[x];
		for(i=0;i<x;i++)
		{
			b[i]=new Book();
		}
		for(i=0;i<x;i++)
		{
			System.out.println("Enter Name of the book,Author,Price,and Total pages:");
			n=s.next();
			a=s.next();
			p=s.nextInt();
			pg=s.nextInt();
			b[i].input(n,a,p,pg);
			b[i].getdata();
			
			
		}
	}	
}
/* OUTPUT:
Enter number of Books:
2
Enter Name of the book,Author,Price,and Total pages:
DaVinciCode
DanBrown
499
550
*********************************************
Book Details:
Name:DaVinciCode
Author:DanBrown
price:499
Total_pages:550
*********************************************
Enter Name of the book,Author,Price,and Total pages:
HarryPotter
JKRowling 
200
500
*********************************************
Book Details:
Name:HarryPotter
Author:JKRowling
price:200
Total_pages:500
*********************************************

*/
		
