package ternaryOperator;

import java.util.Scanner;

public class LargestNumberUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();
        System.out.println("Enter the Third Number: ");
        int c = sc.nextInt();

        int largest = ((a>b)? ((a>c)?a:c) : ((b>c)?b:c));

        System.out.println("The largest Number is : "+largest);
    }
}
