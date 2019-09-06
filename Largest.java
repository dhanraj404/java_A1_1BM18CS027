//COMMAND LINE ARGUMENTS
import java.util.*;
class Largest
{        
	public static void main(String args[])
	{
		int i,large;
		large=Integer.parseInt(args[0]);
		for(i=0;i<args.length-1;i++)
		{
			if (Integer.parseInt(args[i])<Integer.parseInt(args[i+1]))
			large=Integer.parseInt(args[i+1]);
		}
		System.out.println("LARGEST NUMBER IS:"+large);
	}
}
/*
bmsce@bmsce-Precision-T1700:~/java_1BM18CS027$ javac Largest.java
bmsce@bmsce-Precision-T1700:~/java_1BM18CS027$ java Largest 23 45 55 12 88 9
LARGEST NUMBER IS:88
*/
