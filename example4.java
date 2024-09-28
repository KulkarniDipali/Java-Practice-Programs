/* 14. Write a program in Java to calculate the volume of 
a sphere.   
Sample Output:
Calculate the volume of a sphere :
---------------------------------------
Input the radius of a sphere : 6
The volume of a sphere is : 904.32 */

import java.util.Scanner;
class example4
{
 public static void main(String args[]) 
 {   
 Scanner s= new Scanner(System.in);
 System.out.print("Input  the radius of a sphere : ");
 double r=s.nextDouble();
 double  volume= (4*22*r*r*r)/(3*7);
 System.out.println("The volume of a sphere is : " +volume);
 }
}