/*class Principal
	{
		void message()
		{
			System.out.println("This is Principal");
		}
	}
class Professor extends Principal
	{
		void message()
		{
			System.out.println("This is Professor");
		}
	}
class Lecturer extends Professor
	{
		void message()
		{
			System.out.println("This is Lecturer");
		}
	}
class Referance
	{
		public static void main(String args[])
		{
			Principal ref; //reference variable of super class
			Principal x = new Principal();
			Professor y = new Professor();
			Lecturer z = new Lecturer();
			ref = x; //statement1
			ref.message();
			ref = y; //statement2
			ref.message();
			ref = z; //statement3
			ref.message();
		}
	}*/

class PriSchool
{
	void  msg()
	{
		System.out.println("Z. P. Bhojarajnagar");
	}
}	 
class School extends PriSchool
{
	void msg()
	{
		System.out.println("Shri Anantpal Nutan Vidyalaya..");
	}
}
class College extends School
{
	void msg()
	{
		System.out.println("Government Residentital Women's Polytechnic");
	}
}
class Student extends College
{
	void msg()
	{
		System.out.println("Kulkarni Dipali");
	}
}
class Referance
{
	public static void main(String args[])
	{
		PriSchool pri = new PriSchool();
		School sc = new School();
		College clg = new College();
		Student stu = new Student();
		ref = pri;
		ref.msg();
		ref = sc;
		ref.msg();
		ref = clg();
		ref.msg();
		ref = stu();
		ref.msg();
	}
}