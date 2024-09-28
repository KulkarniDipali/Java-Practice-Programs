import java.util.*;
class student
{
	int rollno;
	String name;
	float per;
	student()
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter your rollno:");
	  rollno = sc.nextInt();
	  System.out.print("Enter your name:");
	  name = sc.next();
	  System.out.print("Enter your percentage:");
	  per = sc.nextFloat();
	}
	void show()
	{
		System.out.println(rollno+ "	" +name+ "	" +per );
	}
}
class Const
{
	public static void main(String args[])
	{
		student s1[] = new student[2];
		for(int i = 0; i < 2; i ++)
		{
			s1[i] = new student();
		}
		for(int i = 0; i < 2; i ++)
		{
			s1[i].show();
		}
	}
}