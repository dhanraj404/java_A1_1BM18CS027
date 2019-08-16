import java.util.*;

public class Maxele
{

   	public static void main(String[] args) 
	{
       		Scanner s = new Scanner(System.in);
       		System.out.print("Enter number of rows: ");
       		int r = s.nextInt();
       		System.out.print("Enter number of columns: ");
       		int c = s.nextInt();
       		int a[][] = new int[r][c];
		System.out.println("Enter the matrix:");
       		for (int i = 0; i < r; i++) 
		{
       	   		for (int j = 0; j < c; j++)
			 {
        		       	a[i][j] = s.nextInt();
        		   }
       		}
		int max= a[0][0];
		for (int i = 0; i < r; i++) 
		{
       	   		for (int j = 0; j < c; j++)
			 {
        		       
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
        		   }
       		}
		System.out.println("The maximum element is :"+max);
	}
}
