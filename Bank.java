//SAVINGS ACCOUNT
import java.util.*;
class Acc
{
	String name;
	String c_no;
	double b;
	Acc()
	{
		name="null";
		c_no="null";
		b=0;
	}
	void display()
	{
	System.out.println("NAME:"+name+"\nCOSTUMER NUMBER:"+c_no+"\nBALANCE:"+b);
	}
	void input()
	{	System.out.println("Enter NAME,COSTUMER ID and BALANCE:");
		Scanner s=new Scanner(System.in);
		name=s.nextLine();
		c_no=s.nextLine();
		b=s.nextDouble();
	}
}
class Sav extends Acc
{
	double i;
	int time;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		super.input();
		System.out.println("Enter RATE and TIME:");
		i=sc.nextDouble();
		time=sc.nextInt();
	}
	void display()
	{
		super.display();
		System.out.println("RATE:"+i+"\nTIME:"+time);
	}
}
class Bank
{
	public static void main(String args[])
	{
		Sav ob=new Sav();
		ob.input();
		ob.display();
	}
}
/*
bmsce@bmsce-Precision-T1700:~/java_1BM18CS027$ javac Bank.java
bmsce@bmsce-Precision-T1700:~/java_1BM18CS027$ java Bank
Enter NAME,COSTUMER ID and BALANCE:
Dhanraj
1BM18CS027
0.00
Enter RATE and TIME:
5
12
NAME:Dhanraj
COSTUMER NUMBER:1BM18CS027
BALANCE:0.0
RATE:5.0
TIME:12
*/
