package jan_31st_Task;

import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int number = num;
        int reverse=0;
         while(number>0)
         {
             int digit = number%10;
             reverse =reverse*10+digit;
             number/=10;

         }
         if (num==reverse)
         {
             System.out.println("Number is Palindrome");
         }
         else
         {
             System.out.println("Number is not Palindrome");
         }
    }
}
