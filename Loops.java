/*class Loops
{
	public static void main(String args[])
	{
		int i = 1;
		while(i <= 5)
		{
			System.out.println("Welcome Loops..");
			i ++;
		}
	} 
}
class Loops
{
	public static void main(String args[])
	{
	   int i = 10;
	   while (i >= 1)
	   {
	   	System.out.println(i);
	   	i --;
	   } 	
	}
}

//Program to print even numbers
class Loops
{
	public static void main(String args[])
	{
		int i = 2;
        do
       {
  System.out.println("Even numbers are:"+i);
 i += 2;
        }while(i<=20);
    }
}

class Loops
{
	public static void main(String args[])
	{
		int i = 1;
	    System.out.println("Odd numbers between 1 to 20..");
		do
		{
			System.out.println(i);
			i += 2;
		}while(i <= 20);
	}
}

//program to print odd numbers.
class Loops
{
	public static void main(String args[])
	{
		int i ;
		System.out.println("Odd numbers between 1 to 20..");
		for(i = 1; i <= 20; i += 2)
		{
			System.out.println(i);
		}
	}
}

class Loops
{
	public static void main(String args[])
	{
		int i;
		System.out.println("Even numbers between 1 to 20..");
		for(i = 2; i <= 20; i += 2)
		{
			System.out.println(i);
		}
	}
}

class Loops
{
	public static void main(String args[])
	{
		int i = 2;
		System.out.println("Even numbers between 1 to 20..");
		while(i <= 20)
		{
			System.out.println(i);
			i += 2;
		}
	}
} 

import java.util.*;
class Loops
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i = 1;
		System.out.println("Enter a number:");
	    int a = sc.nextInt();
		while(i <= a)
		{
			System.out.println(i);
			i += 2;
		}
	}
}

// Take 10 integers from keyboard using loop and print their average value on the screen
class Loops
{
	public static void main(String args[])
	{
		float i, sum=0f;
		float avg = 0f;
		for(i = 1; i <= 10; i ++) 
		{
			sum = sum + i;
			avg = sum/10;
		}
			System.out.println("The sum is:"+sum);
			System.out.println("Average of 10 numbers is:"+avg);
	} 
}

//Print the multiplication table of 24, 50 and 29 using loop.
import java.util.*;
class Loops
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i, a;
		System.out.println("Enter a number:");
		a = sc.nextInt();
		for(i = 1; i <= 10; i++)
		{
			System.out.println(a+ " * " +i+ " = " +(a * i));
		}
	}
}

import java.util.*;
class Loops
{
  public static void main(String arg[])
  {
  	Scanner sc = new Scanner(System.in);
  	int i = 1, j ;
  	System.out.println("Enter a number:");
  	j = sc.nextInt();
  	do
  	{
  		System.out.println(j+ " * " +i+ " = " +(j * i));
  		i ++;
  	}while(i <= 10);
  }	
}
//Right triangle
import java.util.*;
class Loops
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int a = sc.nextInt();
		System.out.println("Enter number of columns:");
		int b = sc.nextInt();
abc1:		for(int i = 1; i <= a; i++)
		{
abc2:			for(int j = 1; j <=b; j++)
			{
				System.out.print("* ");
				if(i == j)
				{
					break abc2;
				}
			}
			System.out.println();
		}
	}
}
//Right triangle
 import java.util.*;
 class star
 {
  public static void get(int n)
   {
   	 int i, j;
   	 for ( i = 0; i <= n; i++)
   	 {
   	 	for (j = 0; j <= i; j++)
   	 	{
   	 		System.out.print("* ");
   	 	}
   	 	System.out.println();
   	 }
   }
   public static void main(String args[])
   {
   	Scanner sc = new Scanner(System.in);
   	System.out.println("Enter number:");
   	int n = sc.nextInt();
   	get(n);
   }
 }*/
 
 class Loops
 {
 	public static void main(String args[])
 	{
 		int i = 20;
 		do 
 		{
 			System.out.println("Hello World");
 		}
 		while (i < 10);
 		i++;
 	}
 }