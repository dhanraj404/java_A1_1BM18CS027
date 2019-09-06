import java.util.*;
class Queue 
{
	private int arr[];         
	private int front;         
	private int rear;          
	private int capacity;      
	private int count;        
	
	
	Queue(int size)
	{
		arr = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}

	
	void delete()
	{
		
		if (isEmpty())
		{
			System.out.println("Queue UnderFlow\nProgram Terminated");
			System.exit(1);
		}

		System.out.println("Removing " + arr[front]);

		front = (front + 1) % capacity;
		count--;
	}

	
	void insert(int item)
	{
		
		if (isFull())
		{
			System.out.println("Queue OverFlow\nProgram Terminated");
			System.exit(1);
		}

		System.out.println("Inserting " + item);

		rear = (rear + 1) % capacity;
		arr[rear] = item;
		count++;
	}

	
	 int peek()
	{
		if (isEmpty()) 
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}
		return arr[front];
	}


	int size()
	{
		return count;
	}

	
	Boolean isEmpty()
	{
		return (size() == 0);
	}

	
	Boolean isFull()
	{
		return (size() == capacity);
	}
	
	
	public static void main (String[] args)
	{
		
		Queue q = new Queue(5);

		q.insert(10);
		q.insert(20);
		q.insert(30);
		
		System.out.println("Front element is: " + q.peek());
		q.delete();
		System.out.println("Front element is: " + q.peek());

		System.out.println("Queue size is " + q.size());

		q.delete();
		q.delete();
		
		if (q.isEmpty())
			System.out.println("Queue Is Empty");
		else
			System.out.println("Queue Is Not Empty");
	}
}
/*
bmsce@bmsce-Precision-T1700:~/java_1BM18CS027$ javac Queue.java
bmsce@bmsce-Precision-T1700:~/java_1BM18CS027$ java Queue
Inserting 10
Inserting 20
Inserting 30
Front element is: 10
Removing 10
Front element is: 20
Queue size is 2
Removing 20
Removing 30
Queue Is Empty
*/
