import java.util.*;


class Thread1 implements Runnable {

	Thread t1;
	Thread1(){
		t1 = new Thread(this,"T1");
		t1.start();
	}
	public void run()
	{
		while(true)
		{
			try {
				System.out.println("Bmsce");
				Thread.sleep(10000);
			}
			catch(InterruptedException e){
			System.out.println("Cougth Exception in T1");
			}
		}
	}
}

class Thread2 implements Runnable {

	Thread t2;
	Thread2(){
		t2 = new Thread(this,"T2");
		t2.start();
	}
	public void run()
	{
		while(true)
		{
			try {
				System.out.println("CSE");
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
			System.out.println("Cougth Exception in T2"+e);
			}
		}
	}
}
class Threaddemo {
	public static void main(String args[]){
		Thread1 ob1 = new Thread1();
		Thread2 ob2 = new Thread2();
	}
}


