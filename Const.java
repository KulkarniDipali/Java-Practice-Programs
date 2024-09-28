/*import java.util.*;
class Rectangle
{
	int length, breadth;
	Rectangle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of rectangle:");
		length = sc.nextInt();
		System.out.println("Enter breadth of rectangle:");
		breadth = sc.nextInt();	
		get();
    }
  //  Rectangle(int l, int b)
	//{
	//	length = l;
	//	breadth = b;	
    //}
    void get()
    {
    	int area = length * breadth;
    	System.out.println("Length="+length);
    	System.out.println("Breadth="+breadth);
    	System.out.println("Area of rectangle="+area);
    }
} 
class Const
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
	//	Rectangle r1 = new Rectangle(5,15);
	//	r.get();
	//	r1.get();
	}
}

import java.util.*;
class Circle
{
 int r;
 float pi = 3.14f ; 
 Circle()
 { 
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter radius of the circle:");
   r = sc.nextInt();
 }	
 void get()
 {
 	float area = pi * r * r;
 	System.out.println("Area of circle is "+area);
 }
}
class Const
{
	public static void main(String args[])
{ 
  Circle c = new Circle();
  c.get();
}
}

import java.util.Scanner;
class constructordem
{
int rollno;
String name;
float per;
constructordem(int rollno, String name, float per)
{
this.rollno=rollno;
this.name=name;
this.per=per;
this.dis();
}
void  dis()
{
	System.out.println("Rollno  is"+rollno);
	System.out.println("name is"+name);
System.out.println("Percent is"+per);
}
}
class Constructordemo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll no:");
		int rno=sc.nextInt();
		System.out.println("Enter name:");
		String nm=sc.next();
		System.out.println("Enter percentage:");
		float per=sc.nextFloat();
		constructordem c1=new constructordem(rno, nm,per); 
		System.out.println("Enter Roll no:");
		rno=sc.nextInt();
		System.out.println("Enter name:");
		nm=sc.next();
		System.out.println("Enter percentage:");
     	per=sc.nextFloat();
		constructordem c2=new constructordem(rno, nm,per);
	}
	}
	
import java.util.*;
class student
{
	int rollno;
	String name;
	float per;
	student(int rollno, String name, float per)
	{
		this.rollno = rollno;
		this.name = name;
		this.per = per;
		this.get();
	}
	void get()
	{
		System.out.println(rollno+ "   " + name+ "   " +per);
	}
}
class Const
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your rollno:");
		int rollno = sc.nextInt();
		System.out.print("Enter your name:");
		String name = sc.next();
		System.out.print("Enter your percentage:");
		float per = sc.nextFloat();
	    
	    System.out.print("Enter your rollno:");
		int rollno1 = sc.nextInt();
		System.out.print("Enter your name:");
		String name2 = sc.next();
		System.out.print("Enter your percentage:");
		float per1 = sc.nextFloat();
		
		student s1 = new student(rollno,name,per);
	    student s2 = new student(rollno1,name2,per1);
	}
}*/

