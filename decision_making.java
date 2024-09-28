/* 
 //if-else
import java.util.Scanner;
class decision_making
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		if(a % 2 == 0)
		{
		    System.out.println(a+ " is even number");
		}
		else
		{
			System.out.println(a+ " is even number");
		}
	}
}

 //Nested if 
 import java.util.*;
class decision_making
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks:");
		int a = sc.nextInt();
		if(a >= 91 && a <=100)
		{
			System.out.println("You got A grade.");
		} 
		if(a >= 81 && a <=90)
		{
			System.out.println("You got B grade");
		}
	    if(a >= 71 && a <=80)
		{
			System.out.println("You got C grade.");
		} 
		if(a >= 61 && a <=70)
		{
			System.out.println("You got D grade");
		}
		else
		{
			System.out.println("You are fail");
		}
    }
}

import java.util.Scanner;

class decision-making
{
	public static void main(String arg[])
	{
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number:");
		a = sc.nextInt();
		System.out.println("Input Second number:");
		b = sc.nextInt();
		if(a < b)
		System.out.println(a + " < " +b);
		if(a > b)
		System.out.println(a + " >  " +b);
		if(a >= b)
		System.out.println(a + " >= " +b);
		if(a <= b)
		System.out.println(a + " <= " +b);
		if(a == b)
		System.out.println(a+ " == " +b);
		if(a != b)
		System.out.println(a+ " != " +b);
	}
}
//Even Odd
import java.util.Scanner;
class decision_making
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		if(a % 2 == 0)
		{
		    System.out.println(a+ " is even number");
		}
		else
		{
			System.out.println(a+ " is even number");
		}
	}
}

//Greatest among three numbers
import java.util.Scanner;
class decision_making
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter first number:");
	    a = sc.nextInt();
		System.out.println("Enter second number:");
		b = sc.nextInt();
		System.out.println("Enter third number:");
		c = sc.nextInt();
		
		if(a > b && a > c)
		{
			System.out.println(a+ " is the greatest number.");
		}
		if(b > a && b > c)
		{
			System.out.println(b+ " is the greatest number.");
		}
		if(c > a && c > b)
		{
			System.out.println(c+ " is the greatest number.");
		}
		else
		{
			System.out.println("All numbers are equal.");
		}
	}
}

// vowel or consonant
import java.util.Scanner;
class decision_making
{
	public static void main (String arg[])
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter a character:");
		ch = sc.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println(ch + " is vowel");
		}
		else
		{
			System.out.println(ch+ " is a consonant");
		}
	}
}

//Leap year
import java.util.*;
class decision_making
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

//Positive Negative
import java.util.*;
class decision_making
{
	public static void main(String arg[])
	{
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		a = sc.nextInt();
		if(a > 0) 
		System.out.println(a+ " is a positive number");
		if(a < 0)
		System.out.println(a+ " is a negative number");
		else
		System.out.println(a+ " is a zero");
	}
}

//Absolute value
import java.util.Scanner;
class decision_making
{
	public static void main(String arg[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	int a = sc.nextInt();
	if (a<0)
	{
		System.out.println("The absolute value is:" +(a*(-1)));
	}
	else
	{
		System.out.println("The absolute value is:" +a);
	}
}
}
//Uppercase and lowercase
import java.util.*;
class decision_making
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character:");
		char a = sc.next().charAt(0);
		if(a >= 'a' && a<='z')
		{
			System.out.println("Lowercase");		
		}
		else
		{
			System.out.println("Uppercase");		
		}
	}
}	

//Take values of length and breadth of a rectangle from user and check if it is square or not.
import java.util.*;
class decision_making
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter length:");
		int len = sc.nextInt();
		System.out.println("Enter breadth:");
		int br = sc.nextInt();
		if(len == br)
		{
			System.out.println("It's a square.");
		}
		else
		{
			System.out.println("It's a rectangle.");
		}
	}
}

//Switch case 
import java.util.*;
class decision_making
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		System.out.print("It is ");
		switch(a)
		{
			case 1:
			System.out.println("One");
			break;
			case 2:
			System.out.println("Two");
			break;
			case 3:
			System.out.println("Three");
			break;
			case 4:
			System.out.println("Four");
			break;
			case 5:
			System.out.println("Five");
			break;
			case 6:
			System.out.println("Six");
			break;
			case 7:
			System.out.println("Seven");
			break;
			case 8:
			System.out.println("Eight");
			break;
			case 9:
			System.out.println("Nine");
			break;
			case 0:
			System.out.println("Zero");
			break;
			default:
			System.out.println("Enter valid number");
	}
	}
}
 
import java.util.*;
class decision_making
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Choices are as follows:");
		System.out.println("Tea");
		System.out.println("Coffe");
		System.out.println("Milk");
		System.out.println("Enter your choice:");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1:
			System.out.println("Your choice is Tea");
			break;
			case 2:
			System.out.println("Your choice is Coffee");
			break;
			case 3:
			System.out.println("Your choice is Milk");
			break;
			default:
			System.out.println("Enter valid choice.");
		}
	}
}
// Take two int values from user and print greatest among them.
import java.util.*;
class decision_making
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter second number:"); 
		int b = sc.nextInt();
		if(a > b)
		{
			System.out.println(a+ " is the greatest number.");
		}
		else
		{
			System.out.println(b+ " is the greatest number.");
		}
	}
}
//A shop will give discount of 10% if the cost of purchased quantity is more than 1000. Ask user for quantity Suppose, one util will cost 100.
//Judge and print total cost for user.
import java.util.*;
class decision_making
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the quantity:");
	  int a = sc.nextInt();
	  if((a * 100) > 1000)	
	  {
	  	System.out.println("Discount of " +((a * 100)/10) +" and total cost is: " +((a*100 - (a*100)/10 )));
	  
	  }
	  else
	  {
	  	System.out.println("No discount.");
	  }
	}
}
Given an integer, n perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5 , print Not Weird
If n is even and in the inclusive range of 6 to 20 , print Weird
If n is even and greater than 20, print Not Weird */

import java.util.*;
public class decision_making {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(n % 2 == 0 && n <= 5)
        {
            System.out.println("Not Weird");
        }
        else if(n % 2 == 0 && n < 20 && n > 6)
        {
            System.out.println("Weird");
        }
        else if (n % 2 == 0 && n > 20)
        {
            System.out.println("Not Weird");
        }
        else
        {
            System.out.println("Weird");
        }
    }
}
