import java.util.*;
class Rec
{	int l,b;
	float area;
	void input()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length and width :");
		l= sc.nextInt();
		b= sc.nextInt();
	}
	void area()
	{
		area=l*b;
	}
	void output()
	{
		System.out.println("The Area is :"+area+".");
	}
}
class Rectangle
{
	public static void main(String args[])
	{
		Rec r1=new Rec();
		Rec r2=new Rec();
		r1.input();
		r1.area();
		r1.output();
		r2.input();
		r2.area();
		r2.output();
	}
}
