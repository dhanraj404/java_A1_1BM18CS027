/*

Create a class Student which includes instance variables usn, name and marks of threesubjects. Accept the input through command line arguments.
Raise an user definedexception ‘noargs’ if no arguments are given in command line . Also raise anexception when negative marks are given.

*/
import java.util.*;

class Noargs extends Exception
{
	public String toString()
	{
		return "Command line args empty";
	}
}
class Neg extends Exception
{
	String s; 
	public String toString()
	{
		s =  "Negative marks";
		return s;
	}
}
class Student{

	public static void main(String args[]){
		try{ 
			if(args.length == 0)throw new Noargs(); 
            		for (int i = 2;i<args.length;i++) {
				if(Integer.parseInt(args[i])<0)throw new Neg();
			} 
			for(String x:args)
				System.out.println(x);
		}
		catch(Noargs e)
		{
			System.out.println(e);
		}
		catch(Neg e)
		{
			System.out.println(e);
		}
	}

}		

