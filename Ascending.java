import java.util.*;
class Ascending
{
	public static void main(String args[])
	{	
		int i=0,j=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of Elements:");
		int n=s.nextInt();
		int arr[]=new int[50];
		System.out.println("Enter array Elements:");
		for(i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("After Arranging :");
		for(i=0;i<(n-1);i++)
		{
			for(j=0;j<(n-i-1);j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{ 
			System.out.print(arr[i]+" ");
		}
	}
}

		
		
			

