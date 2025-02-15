package feb_07_Task;

//number
//logic i*number=mul

import java.util.Scanner;

public class multiplicationTableOfNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int mul=0;

        for (int i = 1; i<=10;i++)

        {
            mul = number*i;
            System.out.println(mul);
        }

    }
}
