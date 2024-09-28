/* 17. Write a program in Java to find the Area and Perimeter of a Rectangle.   
Sample Output:
Find the Area and Perimeter of a Rectangle :
-------------------------------------------------
Input the length of the rectangle : 10
Input the width of the rectangle : 15
The area of the rectangle is : 150
The perimeter of the rectangle is : 50 */

import java.util.Scanner;
public class example7
{
  public static void main(String[] args)
 {
  int length, width, area, perimeter;
  Scanner in = new Scanner(System.in);
  System.out.print("Input the  length of the rectangle : ");
  length = in.nextInt();
  System.out.print("Input the  width of the rectangle : ");
  width  = in.nextInt();
  perimeter = 2 * (length + width); 
  area = length * width; 
  System.out.println("The area of the rectangle is : " + area);
  System.out.println("The perimeter of the rectangle is : " + perimeter);
     }
}