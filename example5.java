/* 15. Write a program in Java to calculate the volume of a cube.   
Sample Output:
Calculate the volume of a cube :
---------------------------------------
Input the side of a cube : 5
The volume of a cube is : 125 */

import java.util.Scanner;
class example5
{
  public static void main(String args[])
 {   
  Scanner s= new Scanner(System.in);
  System.out.print("Input the side of a cube : ");
  int side=s.nextInt();
  int  volume=side*side*side;
  System.out.println("The volume of a cube is : " +volume);
 }
}