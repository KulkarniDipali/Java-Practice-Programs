import java.util.*;
class Practice
{
	public static void main(String arg[])
	{
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year:" );
		year = sc.nextInt();
		if((year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0))
		{
				 System.out.println(year+ " is a leap year");
		 }
		 else
		 {
		 	System.out.println(year+ " is not a leap year");
		 }
	}
}