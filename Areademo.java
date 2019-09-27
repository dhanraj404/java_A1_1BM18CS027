import java.util.*;
abstract class Shape
{
int a,b;
Shape(int a, int b)
{
this.a=a;
this.b=b;
}
abstract void printarea();
}
class Rectangle extends Shape
{
Rectangle(int a, int b)
{
super(a,b);
System.out.println("Length = "+a+" Breadth = "+b);
}
void printarea()
{
float area = (float)a*b;
System.out.println("The area of the rectangle = "+area);
}
}
class Triangle extends Shape
{
Triangle(int a, int b)
{
super(a,b);
System.out.println("Base = "+a+" Height = "+b);
}
void printarea()
{
float area = (float)0.5*a*b;
System.out.println("The area of the triangle = "+area);
}
}
class Circle extends Shape
{
Circle(int a, int b)
{
super(a,b);
System.out.println("Radius = "+a);
}
void printarea()
{
float area = (float)3.14*a*a;
System.out.println("The area of the circle = "+area);
}
}
class Areademo
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
Shape ref = null;
int ch,n;
do
{
System.out .println("Enter\n1 for Rectangle\n2 for Triangle\n3 for Circle");
n = sc.nextInt();
switch(n)
{
case 1: System.out.println("Enter length:");
	int l = sc.nextInt();
	System.out.println("Enter breadth:");
	int b = sc.nextInt();
	ref = new Rectangle(l,b);
        break;
case 2: System.out.println("Enter base:");
	int ba = sc.nextInt();
	System.out.println("Enter height:");
	int h = sc.nextInt();
	ref = new Triangle(ba,h);
	break;
case 3: System.out.println("Enter radius;");
	int r = sc.nextInt();
	ref = new Circle(r,0);
        break;
default: System.out.println("Invalid Choice:");
	 break;
}
if(ref!=null)
ref.printarea();
System.out.println("Enter any value to continue and 1 to exit:");
ch = sc.nextInt();
}
while(ch!=1);
}
}
/*
bmsce@bmsce-Precision-T1700:~/java_1BM18CS027$ javac Areademo.java
bmsce@bmsce-Precision-T1700:~/java_1BM18CS027$ java Areademo
Enter
1 for Rectangle
2 for Triangle
3 for Circle
1
Enter length:
10
Enter breadth:
20
Length = 10 Breadth = 20
The area of the rectangle = 200.0
Enter any value to continue and 1 to exit:
0
Enter
1 for Rectangle
2 for Triangle
3 for Circle
2
Enter base:
15
Enter height:
20
Base = 15 Height = 20
The area of the triangle = 150.0
Enter any value to continue and 1 to exit:
0
Enter
1 for Rectangle
2 for Triangle
3 for Circle
3
Enter radius;
5
Radius = 5
The area of the circle = 78.5
Enter any value to continue and 1 to exit:

*/
