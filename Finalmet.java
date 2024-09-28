import java.util.*;
class College
{
	String cname;
	void get()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter college name:");
		cname = sc.next();
	}
}
final class Student extends College //used final keyword to stop inheritance
{
	int rollno;
	String name;
	final void get()      //used final keyword to stop overriding
	{
		super.get();
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter student roll no:");
	  rollno = sc.nextInt();
	  System.out.print("Enter student name:");
	  name = sc.next();
	}
}
class marks extends Student
{
	float sub1,sub2,sub3,sub4,total,per;
	void get()			//Method Overriding   
	{
	super.get();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter sub1 marks:");
	sub1 = sc.nextFloat();
	System.out.print("Enter sub2 marks:");
	sub2 = sc.nextFloat();
	System.out.print("Enter sub3 marks:");
	sub3 = sc.nextFloat();
	System.out.print("Enter sub4 marks:");
	sub4= sc.nextFloat();
	total = sub1 + sub2 + sub3 + sub4; 
	per = total / 4;
	}
	void show()
	{
		System.out.println(cname + "   " +rollno+ "   " +name+"   ");
		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println(sub3);
		System.out.println(sub4);
		System.out.println("Total of marks:"+total);
		System.out.println("Percentage:"+per);
	}
}
class Finalmet
{
	public static void main(String args[])
	{
	  marks m1 = new marks();
	  m1.get();
//	  m1.get1();
	//  m1.get2();
	  m1.show();
	}
}