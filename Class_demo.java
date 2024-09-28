
/*class Product
{
  int pid;
  String pname;
  float price;
  void get()
  {
  	pid=1;
  	pname="Headphone";
  	price=500f;
  }
  void disp()
  {
  	System.out.println("id is:"+pid);
  	System.out.println(pname);
  	System.out.println(price);  
  	
  }
}
class Class_demo
{
	public static void main(String args[])
	{
		 Product p1=new Product();
		 p1.get();
		 p1.disp();
	}
}

import java.util.*;
class Student
{
	int rollno;
	String name;
	float per;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		name = sc.next();
		System.out.println("Enter your rollno:");
		rollno = sc.nextInt();
		System.out.println("Enter your percentage:");
		per = sc.nextFloat(); 
	}
   void output()
   {
	System.out.println("Your name:"+name);
	System.out.println("Your rollno:"+rollno);
	System.out.println("Your percentage:"+per);
    }
}
class Class_demo
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.input();
		s1.output();
	}
}

import java.util.*;
class Employee
{
	int eid;
	String ename;
	float sal;
//	void get()
	//{
//	}
	void show()
	{
	     System.out.println("Employee name:"+ename);
	     System.out.println("Employee id:"+eid);
	     System.out.println("Employee salary:"+sal);
	}
}
class Class_demo
{
	public static void main(String args[])
	{
		Employee e1 = new Employee();
//		e1.get();
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter ename:");
		e1.ename = sc.next();
		System.out.println("Enter eid:");
		e1.eid = sc.nextInt();
		System.out.println("Enter salary:");
		e1.sal = sc.nextFloat();
		e1.show();
	}
}

class Student
{
	int rollno = 2;
	String name = "John";
 //	void get(){
//	  rollno = 2;
//	  name = "John";	
//	}
	void show()
	{
		System.out.println("Name:"+name);
		System.out.println("Roll No:"+rollno);
	}
}
class Class_demo
{
	public static void main(String args[])
	{
		Student s1 = new Student();
	//	s1.get();
		s1.show();
	}
}*/
/*Write a program that would print the information (name, year of joining, salary, address) of three employees by creating 
a class named 'Employee'. The output should be as follows:
Name        Year of joining      Address
Robert            1994               64C- WallsStreat
Sam                2000               68D- WallsStreat
John               1999                26B- WallsStreat
class Employee
{
	String name;
	int year;
	float salary;
	String add;
    void emp1()
    {
    	name = "Robert";
    	year= 1994;
    	salary = 50000f;
    	add = "64C-WallStreat" ;
    }	
    void emp2()
    {
    	name = "Sam";
    	year= 1994;
    	salary = 60000f;
    	add = "68D-WallStreat";
    }
    void emp3()
    {
    	name = "John";
    	year= 1994;
    	salary = 70000f;
    	add = "26B-WallStreat";
    }
    void show()
    {
    	System.out.println("Name" + name + "Year of joining" + year );
    	System.out.println(year);
    	System.out.println(salary);
    	System.out.println(add);
    }
}
class Class_demo
{
	public static void main(String args[])
	{
		Employee e1 = new Employee();
		e1.emp1();
		e1.emp2();
		e1.emp3();
		e1.show();
	}
}

import java.util.*;
class Circle
{
	int r;
	final float pi = 3.14f;
	void get(int ra)
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter radius of circle:");
      r = sc.nextInt();
	}
	void cal()
	{
		float area = pi * r * r;
		System.out.println("Radius="+r);
		System.out.println("pi="+pi);
		System.out.println("Area of circle="+area);
	}
}
class Class_demo
{
	public static void main(String args[])
	{
		Circle c = new Circle();
		c.get();
		c.cal();
	}
}
import java.util.*;
class Rect
{
	int l, b;
	void get()
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter length of rectangle:");
	  l = sc.nextInt();
	  System.out.print("Enter breadth of rectangle:");
	  b = sc.nextInt();	
	}
	void put()
	{
		int area = l * b;
		System.out.println("Area of rectangle="+area);
	}
}
class Class_demo
{
	public static void main(String args[])
	{
		Rect r = new Rect();
		r.get();
		r.put();
	}
}

import java.util.*;
class vowel
{
	char ch;
	void get()
	{
		ch = 'a';
	}
	void put()
	{
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println(ch + " is a vowel");
		}
		else
		{
			System.out.println(ch + " is a consonant");
		}
	}
}
	class Class_demo
	{
		public static void main(String args[])
		{
			vowel v = new vowel();
			v.get();
			v.put();
		}
	}*/
	
