package feb_01_Task;
/*Check if a Number is Divisible by 5 and 11*/

import java.util.Scanner;

public class devisibleBy5and11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();

        if (number%5==0 && number%11==0)
        {
            System.out.println(number+ ":Number is divisible by 5 and 11");
        }
        else
        {
            System.out.println(number+ ":Number is not divisible by 5 and 11");

        }
    }

}
