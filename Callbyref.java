/*class Num
{
	int a;
	void get(Num b)
	{
		b.a++;
		this.show();
	}
	void show()
	{
		System.out.println(a);
	}
}
class Callbyref
{
	public static void main(String args[])
	{
		Num n = new Num();
		n.a = 14;
		n.get(n);
		System.out.println(n.a);
	}
}*/

class Student
{
	String a;
	void get(Student b)
	{
		a = "Anu";
		this.show();
	}
	void show()
	{
		System.out.println(a);
	}
}
class Callbyref
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.get(s1);
	//	System.out.println(s1.a);
	}
}