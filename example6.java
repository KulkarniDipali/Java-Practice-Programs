/* 16. Write a program in Java to calculate the volume of a cylinder.   
Sample Output:
Calculate the volume of a cylinder :
-----------------------------------------
Input the radius of the cylinder : 6
Input the height of the cylinder : 8
The volume of a cylinder is : 904.32 */

import java.util.Scanner;
class example6
{
   public static void main(String args[])
 {   
   Scanner s= new Scanner(System.in);
   System.out.print("Input the radius of the cylinder :");
   double r=s.nextDouble();
   System.out.print("Input the height of the cylinder :");
   double h=s.nextDouble();
   double volume=((22*r*r*h)/7);
   System.out.println("The volume of a cylinder is : " +volume);
 }
}