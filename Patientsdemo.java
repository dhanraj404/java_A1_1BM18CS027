import java.util.*;
class Patients
{
	String patient_id,patient_name,doc;
	int patient_age;
	Patients(){
	patient_id="\0";patient_name="\0";patient_age=0;doc="\0";
	}
	void getdata()
	{
		System.out.println("Enter Patient_ID ,Patient_NAME , DOCTORS_NAME and  Patient_AGE:");
		Scanner s=new Scanner(System.in);
		patient_id=s.nextLine();
		patient_name=s.nextLine();
		doc=s.nextLine();
		patient_age=s.nextInt();
	}
	void display()
	{
		System.out.println("Patient_NAME:"+patient_name+"\nPatient_ID:"+patient_id+"\nPatient_AGE:"+patient_age);
		
	}
}
class Patientsdemo
{
	public static void main(String args[])
	{
		int i;
		String d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Patients:");
		int n=sc.nextInt();
		Patients ob[]=new Patients[n];
		for(i=0;i<n;i++)
		{
			ob[i]=new Patients();
			ob[i].getdata();
		}
		System.out.println("Enter the name of the Doctor:");
		d =sc.next();
		System.out.println("List of  Patients under doctor "+d+":\n");		
		for(i=0;i<n;i++)
		{
			if((ob[i].doc).equals(d))
			{	System.out.println("----------------------");
				ob[i].display();
			}
		}
	}
}
/*
bmsce@bmsce-Precision-T1700:~/java_1BM18CS027$ javac Patientsdemo.java
[1]+  Done                    gedit
bmsce@bmsce-Precision-T1700:~/java_1BM18CS027$ java Patientsdemo
Enter the number of Patients:
3
Enter Patient_ID ,Patient_NAME , DOCTORS_NAME and  Patient_AGE:
1e 
one
john
19
Enter Patient_ID ,Patient_NAME , DOCTORS_NAME and  Patient_AGE:
2e
two
john
22
Enter Patient_ID ,Patient_NAME , DOCTORS_NAME and  Patient_AGE:
3e
three
dave
14
Enter the name of the Doctor:
john
List of  Patients under doctor john:

----------------------
Patient_NAME:one
Patient_ID:1e
Patient_AGE:19
----------------------
Patient_NAME:two
Patient_ID:2e
Patient_AGE:22
*/
			
