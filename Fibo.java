import java.util.*;
class Fibo{  
public static void Fibo(int c)  
	{    
	 int n1=0,n2=1,n3,i;    
 	System.out.print(n1+" "+n2);        
	 for(i=2;i<=c;++i)
		{	
 		 n3=n1+n2;    
 		 System.out.print(" "+n3);    
 		 n1=n2;    
 		 n2=n3;    
 		}    
  
	}
public static void main(String args[])
	{
		System.out.println("Enter End number");
		Scanner sc=new Scanner(System.in);
		int end=sc.nextInt();
		Fibo(end);	
	}
} 
