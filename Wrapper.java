import java.util.*;
class Wrapper
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number as a String:");
		String n = sc.next();
		//String n = new String("10");
		//System.out.println(n);
		int m = Integer.parseInt(n);
		System.out.println("After conversion:");
		System.out.println(m);
		System.out.println("Square of " + m + " is"+ m * m);	
	}
}