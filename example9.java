/* 19. Write a program in Java to find the area and circumference of a circle.   
Sample Output:
Find the area and circumference of any circle :
----------------------------------------------------
Input the radius(1/2 of diameter) of a circle : 5
The area of the circle is : 78.5397
The circumference of the circle is : 31.4159 */

import java.util.Scanner;
class example9
{
  static Scanner sc = new Scanner(System.in);
  public static void main(String args[])
 {
  System.out.print("Input the radius (1/2 of diameter) of a circle : ");
  double radius = sc.nextDouble();
  double area = Math.PI * (radius * radius);
  System.out.println("The area of the circle is : " + area);
  double circumference= Math.PI * 2*radius;
  System.out.println( "The circumference of the circle is : "+circumference) ;
 }
} 