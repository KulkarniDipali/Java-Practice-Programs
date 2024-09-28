/*class Room
{
	int len, bre;
	Room(int a, int b)
	{
		len = a;
		bre = b;
	}
	int area()
	{
		return(len * bre);
	}
}
class Bed extends Room
{
	int height;
	Bed(int a, int b, int c)
	{
		super (a,b);//pass values to superclass
		height = c;
	}
	int volume()
	{
		return(len * bre * height);
	}
}
class Inheritance
{
	public static void main(String args[])
	{
		Bed b1 = new Bed(12, 10, 15);
		int area1 = b1.area();//superclass method
		int volume1 = b1.volume();//baseclass method
		System.out.println("Area:"+area1);
		System.out.println("Volume:"+volume1);
	}
}

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
class Student extends College
{
	int rollno;
	String name;
	void get()
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
	void get()
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
class Super
{
	public static void main(String args[])
	{
	  marks m1 = new marks();
	  m1.get();
//	  m1.get1();
	//  m1.get2();
	  m1.show();
	}
}*/

import java.util.*;
class Room
{
	int len, bre;
	Room(int a, int b)
	{
		len = a;
		bre = b;
	}
	int area()
	{
		return(len * bre);
	}
}
class Bed extends Room
{
	int height;
	Bed(int a, int b, int c)
	{
		super (a,b);//pass values to superclass
		height = c;
	}
	int volume()
	{
		return(len * bre * height);
	}
}
class Super
{
	public static void main(String args[])
	{
		Bed b1 = new Bed(12, 10, 15);
		int area1 = b1.area();//superclass method
		int volume1 = b1.volume();//baseclass method
		System.out.println("Area:"+area1);
		System.out.println("Volume:"+volume1);
	}
}