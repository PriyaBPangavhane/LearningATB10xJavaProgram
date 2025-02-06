package jan25th_ifelse_Task;

import java.util.Scanner;

public class EvenOdd {
    //Check if a Number is Even or Odd.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int X = sc.nextInt();

        if (X%2==0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is odd");
        }

    }
}
