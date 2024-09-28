import java.util.Scanner;

class area_circle
{
	public static void main (String arg[])
	{
		float area , r ;
		final float pi = 3.14f ;

		System.out.println("Enter radius of circle:");
		Scanner sc = new Scanner (System.in);
		r = sc.nextInt();
		area = pi * r * r ;		
		System.out.println("Area of circle:"+area);
	}
}