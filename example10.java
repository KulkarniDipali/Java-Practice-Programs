/* 20. Write a program in Java to convert temperature in Celsius to Fahrenheit.   
Sample Output:
Convert temperature in Celsius to Fahrenheit :
---------------------------------------------------
Input the temperature in Celsius : 35
The temperature in Celsius : 35
The temperature in Fahrenheit : 95 */

import java.util.Scanner; 
public class example10
{
   public static void main(String[] args) 
 {
   int cel, far;
   Scanner sc= new Scanner(System.in);
   System.out.println("Input the temperature in Celsius : ");
   int a= sc.nextInt();
   System.out.println("The temperature in Celsius is : "+a);
   cel= a;
   far = cel * 9/5 + 32;
   System.out.println("Temperature in Fahrenheit is : "+far);

  }
}