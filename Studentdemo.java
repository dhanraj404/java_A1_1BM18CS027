import java.util.*;
class Student
{
	String USN,name;
	int arrc[],sub;
	float t,s;
	int arrm[];
	void get_data()
	{
		int i;
		Scanner se=new Scanner(System.in);
		System.out.println("Enter no of subjects:");
		sub=se.nextInt();
		arrc=new int[sub];
		arrm=new int[sub];
		System.out.println("Enter usn no:");
		USN=se.next();
		System.out.println("Enter name of student:");
		name=se.next();
		for(i=0;i<sub;i++)
		{
			System.out.println("Enter credits in sub :  " + (i+1));
			arrc[i]=se.nextInt();
		}
		for(i=0;i<sub;i++)
		{
			System.out.println("enter marks in sub :  " + (i+1));
			arrm[i]=se.nextInt();
		}
	}
	void cal_sgpa()
	{
		int sum=0,total=0,i,points,flag=1;
		for(i=0;i<sub;i++)
		{
			if(arrm[i]>=90&&arrm[i]<=1000)
				points =10;
			else if(arrm[i]>=75&&arrm[i]<=89)
				points =9;
			else if(arrm[i]>=65&&arrm[i]<=74)
				points =8;
			else if(arrm[i]>=55&&arrm[i]<=64)
				points =7;
			else if(arrm[i]>=40&&arrm[i]<=54)
				points  =6;
			else
				points = 0;
			sum=sum +(points*arrc[i]);
			t=t+arrm[i];
		}
		for(i=0;i<sub;i++)
		{
			total=total+arrc[i];
		}
		float sgpa=(float)sum/total;
		s=sgpa;
		System.out.println("Total marks:  " + t);
		System.out.println("SGPA of student is :  " + sgpa);
		for(i=0;i<sub;i++)
		{
			if(arrm[i]<40)
			{
				flag=0;
			}
		
		}
		if(flag==0)
		{	System.out.println("FAIL");}
		else
		{	System.out.println("PASS");}		
		
		
		
	}
	void display_sgpa()
	{	
		System.out.println("Name:  " + name);
		System.out.println("USN:  " + USN);
		System.out.println("Total marks:  " + t);
		System.out.println("SGPA:  " + s);
		
	}
}
class Studentdemo
{
	public static void main(String args[])
{
	Scanner se=new Scanner(System.in);
	Student s=new Student();
	s.get_data();
	s.cal_sgpa();
	s.display_sgpa();
}
}
	
