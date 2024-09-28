/*import java.util.*;
class Exceptiondemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		try
		{
			System.out.println("Enter two numbers");
			a = sc.nextInt();
			b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Zero value not allowed");
		}
	}
}
import java.util.*;
class Exceptiondemo
{
	public static void main(String args[])
	{
		int n[] = {5, 8, 6, 7, 2};
		try
		{
			System.out.println(n[5]);
		}
		catch(Exception e)
		{
			System.out.println("Out of array index");
		}
	}
}*/

class Main 
{
	public static void main(String args[])
	{
		try
		{
			int array[] = new int[10];
			array[10] = 30 / 0;
 		}
 		catch(Exception | ArithmeticException | ArrayIndexOutOfBoundsException e)
 		{
 			System.out.println(e.getMessage());
 		}
	}
}