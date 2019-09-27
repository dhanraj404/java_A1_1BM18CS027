import java.util.*;
interface Stack
{
	void push(int item);
	int pop();
	void display();
}
class Dynamic implements Stack
{
	int size,top, st[];
	Dynamic()
	{
		Scanner se=new Scanner(System.in);
		System.out.println("Enter size");
		size=se.nextInt();
		st=new int[size];
		top=-1;
	}
	public void push(int item)
	{
		if(top==size-1)
		{
			size=size*2;
			int temp[]=new int[size];
	
		for(int i=0;i<size/2;i++)
			{
				temp[i]=st[i];
			}
			st=temp;
			st[(++top)]=item;
		}
		else
			st[(++top)]=item;
	}
	
	public int pop()
	{
		if(top==-1)
			{
				System.out.println("Stack underflow");
				return -9999;
			}
		else
		{
			return st[(top--)];
		}
	}
	public void display()
	{
		if(top==-1)
			System.out.println("Stack is empty");
		else
	{
		System.out.println("Elements in stack are");
		for(int i=top;i>=0;i--)
		{
			System.out.println(st[i]);
		}
	}
	}
}
class Dynamicstack
{
	public static void main(String args[])
{
	Scanner se=new Scanner(System.in);
	Stack ref;
	ref=new Dynamic();
	System.out.println("1.Push \n2.Pop \n3.Display \n4.Exit");
	System.out.println("Enter choice:");
	int choice =se.nextInt();
	while(choice!=-1)
	{
		switch(choice)
	{
		case 1: System.out.println("Enetr elemnets to be inserted");
			int element=se.nextInt();
			ref.push(element);
			break;
		case 2: int e=ref.pop();
			System.out.println("The popped element is "  + e);
			break;
		case 3:ref.display();
			break;
		case 4:System.exit(1);
			break;
		default : System.out.println("Invalid input");
	}
	System.out.println("Enter choice");
	 choice =se.nextInt();
	}
}
}
/*
bmsce@bmsce-Precision-T1700:~/java_1BM18CS027$ javac Dynamicstack.java
bmsce@bmsce-Precision-T1700:~/java_1BM18CS027$ java Dynamicstack
Enter size
3
1.Push 
2.Pop 
3.Display 
4.Exit
Enter choice:
1
Enetr elemnets to be inserted
10
Enter choice
1
Enetr elemnets to be inserted
20
Enter choice
1
Enetr elemnets to be inserted
30
Enter choice
1
Enetr elemnets to be inserted
40
Enter choice
3
Elements in stack are
40
30
20
10
Enter choice
4
*/
