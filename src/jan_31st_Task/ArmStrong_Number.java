package jan_31st_Task;

import java.util.Scanner;

public class ArmStrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();  // Count the number of digits

        while (num > 0) {
            int digit = num % 10;  // Extract last digit
            sum += Math.pow(digit, digits);  // Raise digit to the power of total digits and add to sum
            num /= 10;  // Remove last digit
        }

        // Check if sum equals original number
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong Number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong Number.");
        }

    }
}

