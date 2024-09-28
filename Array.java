/*class Array
{
	public static void main(String args[])
	{
		int a [];                 // we can declare a variable in this two ways..
		a = new int[6];
		//int a [] = new int[6];
		a[0] = 1;
		a[1] = 19;
		a[2] = 8;
		a[3] = 9;
		a[4] = 19;
		a[5] = 8;
		System.out.println(a[0]);
		System.out.println(a[3]);		
	}
} */

import java.util.*;
class Array
{
	public static void main(String args[])
	{
			int a [] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five numbers:");
		for(int i =0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
				System.out.println("Enter five numbers:");
		for(int i = 0; i < 5; i++ )
		{
            System.out.println(a[i]); 
		}
				System.out.println("Enter five numbers:");                                                     
		for(int i = 4; i >= 0; i-- )
		{
            System.out.println(a[i]); 
		}
	}
}