 //find square and cube 
 
 import java.util.Scanner;

class input_prg
{
	public static void main(String arg[])
	{
		int a, sq, cu ;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner (System.in);
		a = sc.nextInt();
		System.out.println("Square:"+(a*a));
		System.out.println("cube:" +(a*a*a));
	}
}
