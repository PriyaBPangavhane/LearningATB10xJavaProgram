package jan30th_Tasks;

import java.nio.file.FileSystemNotFoundException;
import java.util.Formattable;
import java.util.Scanner;
//Check whether the number is Prime or not
//1. input from user : Number ex: 1,3,5,7,9 :Prime
//2. logic: need to check whether number has only two divisor that is 1 and number itself
//3.Output : Print number is prime or not
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int count=0;

        for (int i=1;i<=num;i++) {
            count++;

        }

            if (count == 2) {
                System.out.println("Number is Prime ");
            } else {
                System.out.println("Number is not Prime");
            }

    }
}
