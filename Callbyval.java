class Num1
{
	int a;
	Num1(int a)
	{
		this.a = a;
		this.show();
	}
	void show()
	{
		a++;
		System.out.println(a);
	}
}
class Callbyval
{
	public static void main(String args[])
	{
		int n = 10;
		Num1 ob = new Num1(n);
		System.out.println(n); 
	}
}