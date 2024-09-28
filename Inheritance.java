/*class college
{
	String cname;
	void get()
	{
		cname = "GRWPL";
	}
}
	class Student extends college
	{
		int rollno;
		String name;
		float per;
		void get1()
		{
			rollno = 1;
			name = "Anu";
			per = 98f;
		}
      	void show()
	    {
		    System.out.println(cname+"   "+rollno+"   "+name+"    "+per);
	    }
   }
class Inheritance
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.get();
		s1.get1();
		s1.show();
	}
}

class A
{
    int i = 10;
}
 
class B extends A
{
    int i = 20;
}
 class Inheritance
{
    public static void main(String[] args)
    {
        A a = new B();
 
        System.out.println(a.i);
    }
}

import java.util.*;
class Country
{
	String cou;
	void get()
	{
		Scanner sc = new Scanner(System.in);
		cou = sc.next();
	}
	void show()
	{
		System.out.println(cou);
	}
}
class City extends Country
{
	String city;
	void get1()
	{
	    Scanner sc = new Scanner(System.in);
		city = sc.next();
	}
	void disp()
	{
		System.out.println(cou+"     "+city);
	}
}
class Inheritance 
{
	public static void main(String args[])
	{
	City obj = new City();
	obj.get();
	obj.show();
	obj.get1();
	obj.disp();
	}
}

class Inheritance
{
	public static void main(String args[])
	{
		System.out.println(1);
	}
}

//Multilevel Inheritance
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
	void get1()
	{
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
	void get2()
	{
	
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
class Inheritance
{
	public static void main(String args[])
	{
	  marks m1 = new marks();
	  m1.get();
	  m1.get1();
	  m1.get2();
	  m1.show();
	}
}

//hierarchical Inheritance
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
class CO extends College
{
   int rno;
   String name;
   float per;
   void get1()
   {
   	 Scanner sc = new Scanner(System.in);
   	 System.out.println("Computer Engineering");
   	 System.out.print("Enter student's rno:");
   	 rno = sc.nextInt();
   	 System.out.print("Enter student name:");
   	 name = sc.next();
   	 System.out.print("Enter student percentage:");
   	 per = sc.nextFloat(); 
   }	
   void show()
   {
   	System.out.println(cname+"   " +rno+"   "+name+"   "+per);
   }
}
class ET extends College
{
   int rno;
   String name;
   float per;
   void get2()
   {
   	 Scanner sc = new Scanner(System.in);
   	 System.out.println("Electronics and Telecommunication");
   	 System.out.print("Enter student's rno:");
   	 rno = sc.nextInt();
   	 System.out.print("Enter student name:");
   	 name = sc.next();
   	 System.out.print("Enter student percentage:");
   	 per = sc.nextFloat(); 
   }	
   void show1()
   {
   	System.out.println(cname+"   " +rno+"   "+name+"   "+per);
   }
}
class Inheritance
{
	public static void main(String args[])
	{
		CO c = new CO();
		c.get();
		c.get1();
		c.show();
		ET e = new ET();
		e.get();
		e.get2();
		e.show1();
	}
}

//Single Inheritance
import java.util.*;
class Student
{
	int rollno;
	String name;
	void get()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student's roll no:");
		rollno = sc.nextInt();
		System.out.print("Enter student's name:");
		name = sc.next();
	}
}
class Library extends Student
{
	int Member_no;
	void get1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Member Number:");
		Member_no = sc.nextInt();
	}
	void show()
	{
		System.out.println(rollno+ "  "+ name +"    "+Member_no);
	}
}
class Inheritance
{
	public static void main(String args[])
	{
		Library lib = new Library();
		lib.get();  
		lib.get1();
		lib.show();
	}
}*/

