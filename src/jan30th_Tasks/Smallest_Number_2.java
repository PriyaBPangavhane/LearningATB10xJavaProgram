package jan30th_Tasks;

import java.util.Scanner;

public class Smallest_Number_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two Numbers");
        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();

        if(Num1<Num2)
        {
            System.out.println("Smallest Number is "+Num1);
        }
        else
        {
            System.out.println("Smallest Number is "+Num2);
        }
    }

}
