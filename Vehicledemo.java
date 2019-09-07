import java.util.*;
class Vehicle
{
	private String model;
	private String colour;
	private int year;
	public static int noc = 0;
	Vehicle(String model, String colour, int year)
		{
			this.model = model;
			this.colour = colour;
			this.year = year;
			noc++;
		}
	static void func()
	{
		System.out.println("The number of cars = "+noc);
	}
	void output()
	{
		System.out.println("\nModel = "+model);
		System.out.println("Colour = "+colour);
		System.out.println("Year = "+year);
	}
}
class Vehicledemo
{
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		Vehicle v[] = new Vehicle[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("\n\nEnter the model");
		String model = sc.next();
		System.out.println("Enter the colour");
		String colour = sc.next();
		System.out.println("Enter the year of manufacture");
		int year = sc.nextInt();
		v[i] = new Vehicle(model,colour,year);
		v[i].output();
	}
	System.out.println("\n\n");
	Vehicle.func();
	}
}
/*
Enter the value of n
2


Enter the model
Swift
Enter the colour
White
Enter the year of manufacture
2018

Model = Swift
Colour = White
Year = 2018


Enter the model
Audi
Enter the colour
Red
Enter the year of manufacture
2005

Model = Audi
Colour = Red
Year = 2005



The number of cars = 2
*/