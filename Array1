import java.util.*;
public class Array1
{
	public static void main(String args[])
{
	Scanner se=new Scanner(System.in);
	int row_size,col_size,i,j;
	System.out.println("Enter row size");
	row_size=se.nextInt();
	System.out.println("Enter column size");
	col_size=se.nextInt();
	int arr[][]=new int[row_size][col_size];
	int arr1[][]=new int[col_size][row_size];
	System.out.println("Enter elements of array");
	for(i=0;i<row_size;i++)
	{
		for(j=0;j<col_size;j++)
		{
			arr[i][j]=se.nextInt();
		}
	}
	for(i=0;i<row_size;i++)
	{
		for(j=0;j<col_size;j++)
		{
			arr1[j][i]=arr[i][j];
		}
	}
	System.out.println("Transposed array is : ");
	for(i=0;i<col_size;i++)
	{
		for(j=0;j<row_size;j++)
		{
			System.out.print(arr1[i][j] + " ");
		}
		System.out.print("\n");
	}
}
}
