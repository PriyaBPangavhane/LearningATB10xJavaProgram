package feb_07_Task;

import java.util.Scanner;

public class factorialOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        int fact=1;

        for(int i=1; i<=num;i++)
        {
            fact=i*fact;

        }
        System.out.println("Factorial of "+num+" is:"+fact);
    }
}
