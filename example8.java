/* 18. Write a program in Java to find the area of any triangle using Heron's Formula.   
Sample Output:
Find the area of any triangle using Heron's Formula :
----------------------------------------------------------
Input the length of 1st side of the triangle : 5
Input the length of 2nd side of the triangle : 5
Input the length of 3rd side of the triangle : 5
The area of the triangle is : 10.8253 */

import java.util.Scanner;
public class 
 {
   public static void main(String[] args)
  {
   double s1, s2, s3, area, S;
   Scanner scanner;
   scanner = new Scanner(System.in);
   System.out.print("Input the length of 1st side of the triangle : ");
   s1 = scanner.nextDouble();
   System.out.print("Input the length of 2nd side of the triangle : ");
   s2 = scanner.nextDouble();
   System.out.print("Input the length of 3rd side of the triangle : ");
   s3 = scanner.nextDouble();
   S = (s1 + s2 + s3) / 2;
   area = Math.sqrt(S * (S - s1) * (S - s2) * (S - s3));
   System.out.format("The area of the triangle is : %.2f\n", area);
  }
}