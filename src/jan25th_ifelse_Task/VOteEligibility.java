package jan25th_ifelse_Task;

import java.util.Scanner;

public class VOteEligibility {
    public static void main(String[] args) {

        //Check if a Person is Eligible to Vote (Age Check).

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();

        if (age>=18)
        {
            System.out.println("You are eligible for Vote");

        }
        else
        {
            System.out.println("You are not eligible for Vote");
        }

    }

}
