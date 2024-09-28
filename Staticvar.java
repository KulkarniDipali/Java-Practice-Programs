/*class Student
{
	int rno;
	String name;
	float per;
	static String board; //= "MSBTE";
	void get()
	{
		rno = 1;
		name = "Ria";
		per = 87f;
	}
	static void disp()
	{
		System.out.println(board);
	}
	void show()
	{
		System.out.println(rno+ "   " +name+"   " +per+ "   " + board);
	}
}
class Staticvar
{
	public static void main(String args[])
	{
		Student.board = "MSBTE";
		Student.disp();
	    Student s1 = new Student();
		s1.get();
		s1.show();
	}
}

class Student
{
	int rno;
	String name;
	float per;
	static String board; //= "MSBTE";
	Student(int rno, String name, float per)
	{
		this.rno = rno;
		this.name = name;
		this.per = per;
	}
	Student()
	{
		rno = 1;
		name = "Ria";
		per = 87f;
	}
	static void disp()
	{
		System.out.println(board);
	}
	void show()
	{
		System.out.println(rno+ "   " +name+"   " +per+ "   " + board);
	}
}
class Staticvar
{
	public static void main(String args[])
	{
		Student.board = "MSBTE";
		Student.disp();
	    Student s1 = new Student();
		s1.show();
		Student s2 = new Student(2,"Anu",88f);
		Student s3 = new Student(3,"Shreya",84f);
		s2.show();
		s3.show();
	}
}
import java.util.*;
class Emp
{
	int eid;
	String ename;
	float esal;
	static String ecom = "GOOGLE";
	void get()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee id:");
		eid = sc.nextInt();
		System.out.print("Enter employee name:");
		ename = sc.next();
		System.out.print("Enter employee salary:");
		esal = sc.nextInt();
	}
    void show()
    {
    	System.out.println(eid+"   " +ename+ "   " +esal+ "   " +ecom);
    }
}
class Staticvar
{
	public static void main(String args[])
	{
		Emp e1 = new Emp();
		e1.get();
		e1.show();
	}
}

public class Staticvar{
            int num1 = 6;
            static int num2 = 10;
 
      public static void main(String args[]) {
            Staticvar s1 = new Staticvar();
            Staticvar s2 = new Staticvar();
            s1.num1 = 15;
            s1.num2 = 17;
            s2.num1 = 22;
            s2.num2 = 28;
            System.out.println(s1.num1 + " " + s1.num2 + " " + s2.num1 + " "+ s2.num2);
   }
}*/
 