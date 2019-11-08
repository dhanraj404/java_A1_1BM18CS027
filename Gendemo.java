import java.util.*;
class Generics<A,B>
{
	private A a;
	private B b;
	public Generics(A a,B b) {
		this.a = a;
		this.b = b;
	}
	public A getFirst() {
		return a;
	}
	public B getSecond() {
	return b;
	}
}
class Gendemo {
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Integer and String:");
		int num = s.nextInt();		
		String str = s.next();
		Generics<Integer,String> obj = new Generics<Integer,String>(num,str);
		System.out.println("Integer value:"+obj.getFirst());
		System.out.println("String value:"+obj.getSecond());
	}

	
}



