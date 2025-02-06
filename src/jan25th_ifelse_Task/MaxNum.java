package jan25th_ifelse_Task;

import java.util.Scanner;

public class MaxNum {
    // Find the Maximum of Two Numbers.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int X = sc.nextInt();
        System.out.println("Enter the 2nd Number: ");
        int Y = sc.nextInt();

        if(X>Y)
        {
            System.out.println("X is the largest: "+X);

        }

        else
        {

            System.out.println("Y is the largest: "+Y);
        }
    }
}
