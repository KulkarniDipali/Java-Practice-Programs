/*//Java program to multiply two floating point numbers

class Practice
{
	public static void main(String arg[])
	{
		float a = 203.23f; 
		float b = 520.12f;
		float c = a * b;
		System.out.println("Multiplication="+c); 		
	}
}

//Java program to print the sum of two numbers

class Practice
{
	public static void main (String arg[])
	{
		int a,b;
		a = 74;
		b = 34;
		System.out.println("Add:"+(a+b)); 
	}
}

//Division

class Practice
{
	public static void main(String arg[])
	{
		int a = 50 , b = 3;
		System.out.println("Division:"+(a/b));
	}
}

// addition taking input 

import java.util.Scanner;

class Practice
{
	public static void main(String arg[])
	{
		int a, b ; 
		System.out.println("Enter First number:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		System.out.println("Enter second number:");
		b = sc.nextInt();
		
		System.out.println("Addition =" +(a+b));
	}
}

// Division

import java.util.Scanner;

class Practice
{
	public static void main(String arg[])
	{
		int a , b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		a = sc.nextInt();
		System.out.println("Enter second number:");
		b = sc.nextInt();
		System.out.println("Division:"+(a/b));
	}
}

//Multiplication

import java.util.Scanner;

class Practice
{
	public static void main(String arg[])
	{
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number:");
		a = sc.nextInt();
		System.out.println("Input second number:");
		b = sc.nextInt();
		System.out.println("Product of " +a+ " and " +b+ " is:" +(a*b)); 
	}
}

// mathematical expressions

class Practice
{
	public static void main(String arg[])
	{
		System.out.println("-5 + 8 * 6 = " + (-5 + 8 * 6));
		System.out.println("(55 + 9) % 9 = " + ((55 + 9) % 9));
		System.out.println("20 + (-3) * 5 / 8 = " + (20 + (-3) * 5 / 8));
		System.out.println("5 + 15 / 3 * 2 - 8 % 3 = " + (5 + 15 / 3 * 2 - 8 % 3));
	}
} 

//all arithmetic operators

import java.util.Scanner;

class Practice
{
	public static void main(String arg[])
	{
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number:");
		a = sc.nextInt();
		System.out.println("Input second number:");
		b = sc.nextInt();
		System.out.println(a+ "+" +b+ " = " + (a + b));
		System.out.println(a+ "-" +b+ " = " + (a - b));
		System.out.println(a+ "*" +b+ " = " + (a * b));
		System.out.println(a+ "/" +b+ " = " + (a / b));
		System.out.println(a+ "%" +b+ " = " + (a % b));
	}
} 

//Avarage of three numbers

import java.util.Scanner;

class Practice
{
	public static void main(String arg[])
	{
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number:");
		a = sc.nextInt();
		System.out.println("Input second number:");
		b = sc.nextInt();
		System.out.println("Input third number:");
		c = sc.nextInt();
		System.out.println("Average of these number is:"+(a + b + c ) / 3 );
	}
}

class Practice
{
	public static void main(String arg[])
	{
		System.out.println("          J             A         V               V          A  ");
		System.out.println("          J           A  A        V           V          A  A ");
		System.out.println("J        J         A       A        V      V           A A  A");
		System.out.println(" J       J       A  A A   A        V  V           A         A");
		System.out.println("     J  J      A                A        V           A             A");
	}
}


//Area of hexagon
import java.util.Scanner;
class Practice
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("input the length of a side of the hexagon:");
		int s = sc.nextInt();
		double area = (6 * (s * s)) / (4 * Math.tan(Math.PI / 6));
		System.out.println("The area of the hexagon is:" +area);
	}
}

// Area of Polygon
import java.util.Scanner;

class Practice
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of side of the polygon:");
		int n = sc.nextInt();
		System.out.println("Input the length of one of the sides:");
		int s = sc.nextInt();
		double area = (n * (s * s)) / (4 * Math.tan(Math.PI/n));
		System.out.println("The area of Polygon is:"+area);
	}
}

// List the available character sets in the charset objects
import java.nio.charset.Charset;

class Practice
{
	public static void main(String arg[])
	{
		System.out.println(" List the available character sets in the charset objects:");
		for(String str : Charset.availableCharsets().keySet())
		{
			System.out.println(str);
		}
	}
}

// ASCII value

class Practice
{
	public static void main(String arg[])
	{
		int chr = 'A';
		System.out.println("The ASCII value of A is: " +chr); 
	}    	
}
*/
