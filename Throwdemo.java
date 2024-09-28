class Throwdemo
{
	public static void main(String args[])
	{
		int a, b, c;
		try
		{
			a = 5;
			b = 0;
			c = a + b;
			if(b == 0)
			throw new ArithmeticException("Zero value not allowed");
			else
			{
				System.out.println("Addition=" +c);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
}