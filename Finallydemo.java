import java.util.*;
class Finallydemo
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
		finally
		{
			System.out.println("End of program..");
		}
	}
}