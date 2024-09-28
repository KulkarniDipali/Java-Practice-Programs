import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        if(n % 2 == 0 && n <= 100)
        {
       		 if(n <= 5)
        	{
            	System.out.println("Not Weird less than 5");
        	}
        	else if( n < 20 && n > 6)
        	{
            	System.out.println("Weird 6 to 20");
        	}
        	else if ( n > 20)
        	{
            	System.out.println("Not Weird less than 20");
        	}
        }
        	else
        	{
            	System.out.println("Weird odd");
        	}
    }
}
