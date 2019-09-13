import java.util.*;
class Person
{
	String name,address;
	int age;
	Person(){
		name="\0";address="\0";age=0;
		}
	void getdata()
	{
		System.out.println("Enter NAME,ADDRESS and AGE:");
		Scanner s=new Scanner(System.in);
		name=s.nextLine();
		address=s.nextLine();
		age=s.nextInt();
	}
	void display()
	{
		System.out.println("NAME:"+name+"\nADDRESS:"+address+"\nAGE:"+age);
	}
}
class Student extends Person
{
	int roll,sem;
	void input()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Roll number and Semester:");
		roll=s.nextInt();
		sem=s.nextInt();
	}
	void display1()
	{
		System.out.println("\nROLL NUMBER:"+roll+"SEMESTER:"+sem);
	}
}
class Exam extends Student
{

		double marks1,marks2;
		double avg;
		void getdata()
		{	super.getdata();
			System.out.println("\nEnter Marks of two subjects:");
			Scanner s=new Scanner(System.in);
			marks1=s.nextDouble();
			marks2=s.nextDouble();
			
		}
		void display()
		{
			super.display();
			System.out.println("MARKS 1:"+marks1+"\tMARKS 2:"+marks2+"\tAVERAGE:"+avg);
		}
		void average()
		{
		 avg=(marks1+marks2)/2;
		}
}
class Persondemo
{
	public static void main(String args[])
	{
		int i,top=0;	
		double maxavg;	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n=sc.nextInt();
		Exam ob[]=new Exam[n];
		for(i=0;i<n;i++)
		{
			ob[i]=new Exam();
			ob[i].getdata();
			ob[i].input();
			ob[i].average();
		}
		for(i=0;i<n-1;i++)
		{
			if(ob[i+1].avg>ob[i].avg)
			{
				top=i+1;
				maxavg=ob[i+1].avg;
			}
			else
			{
				top=i;
				maxavg=ob[i].avg;
			}
		}
		System.out.println("****************************************");
		for(i=0;i<n;i++)
		{
			ob[i].display();
			ob[i].display1();
		}
		System.out.println("****************************************");
		System.out.println("THE TOPPER IS:");
		ob[top].display();
		ob[top].display1();
	}
}		
/*
bmsce@bmsce-Precision-T1700:~/java_1BM18CS027$ javac Persondemo.java
bmsce@bmsce-Precision-T1700:~/java_1BM18CS027$ java Persondemo
Enter the number of students:
2
Enter NAME,ADDRESS and AGE:
Ram
Banglore
18

Enter Marks of two subjects:
99
100
Enter the Roll number and Semester:
1
3
Enter NAME,ADDRESS and AGE:
Sham
Mysore
18

Enter Marks of two subjects:
100
98
Enter the Roll number and Semester:
2
3
****************************************
NAME:Ram
ADDRESS:Banglore
AGE:18
MARKS 1:99.0	MARKS 2:100.0	AVERAGE:99.5

ROLL NUMBER:1SEMESTER:3
NAME:Sham
ADDRESS:Mysore
AGE:18
MARKS 1:100.0	MARKS 2:98.0	AVERAGE:99.0

ROLL NUMBER:2SEMESTER:3
****************************************
THE TOPPER IS:
NAME:Ram
ADDRESS:Banglore
AGE:18
MARKS 1:99.0	MARKS 2:100.0	AVERAGE:99.5

ROLL NUMBER:1SEMESTER:3
*/
