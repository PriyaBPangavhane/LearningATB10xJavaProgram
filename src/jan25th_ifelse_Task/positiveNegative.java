package jan25th_ifelse_Task;

import java.util.Scanner;

public class positiveNegative {
    // Check if a Number is Positive or Negative
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x= sc.nextInt();

        if(x>=0)
        {
            System.out.println("Number is Positive: "+x);
        }
        else
        {
            System.out.println("Number is Negative: "+x);
        }

    }
}
