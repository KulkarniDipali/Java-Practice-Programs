class Num
{
	int a, b, c;
	void cal() throws ArithmeticException
	{
		a = 10;
		b = 2;
		c = a / b;
		System.out.println("Division= " +c);
		System.out.println("End of the program ");	
	}
}
class Throwsdemo
{
	public static void main(String args[])
	{
		Num nm = new Num();
		try
		{
		nm.cal();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Zero value not allowed");
		}
	}
}