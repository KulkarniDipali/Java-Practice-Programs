/* 13. Write a program in Java to swap two numbers.   
Sample Output:
Swap two numbers :
-----------------------
Input 1st number : 25
Input 2nd number : 39
After swapping the 1st number is : 39
After swapping the 2nd number is : 25 */

public class example3
{
 public static void main(String[] args) 
 {
 int first = 25, second = 39;
 System.out.println("Input 1st number : " + first);
 System.out.println("Input 2nd number : " + second);
 int temp = first;
    first = second;
    second = temp;
    System.out.println("After swapping the 1st number is : " + first);
    System.out.println("After Swapping the 2nd number is : " + second);
 }
}