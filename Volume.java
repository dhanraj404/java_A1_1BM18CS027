//VOLUME USING INHERITANCE
import java.util.*;
class Twod{
	private int l,b;
	Twod(){l=0;b=0;}
	Twod(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	int area()
	{
		return l*b;
	}
}
class Threed extends Twod{
	int h;
	Threed(){
		super();
		h=0;
	}
	Threed(int l,int b,int h)
	{
		super(l,b);
		this.h=h;
	}
	int volume()
	{
		return area()*h;
	}
}
class Volume{
	public static void main(String args[])
	{
		Threed ob=new Threed(5,5,5);
		System.out.println("AREA:"+ob.area());
		System.out.println("VOLUME:"+ob.volume());	
	}
}	
/*
bmsce@bmsce-Precision-T1700:~/java_1BM18CS027$ javac Volume.java
bmsce@bmsce-Precision-T1700:~/java_1BM18CS027$ java Volume
AREA:25
VOLUME:125
*/
