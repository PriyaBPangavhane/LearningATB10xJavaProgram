package jan30th_Tasks;

import java.util.Scanner;

public class Largest_3_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Number ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd Number ");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd Number ");
        int c = sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println("A is the largest: " +a);
        }
        else if (b>a && b>c)
        {
            System.out.println("B is the largest: " +b);

        }
        else
        {
            System.out.println("C is the largest: " +c);
        }
    }

}
