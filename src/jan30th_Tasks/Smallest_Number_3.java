package jan30th_Tasks;

import java.util.Scanner;

public class Smallest_Number_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if(n1<n2 && n1<n3)
        {
            System.out.println("n1 is the smallest" +n1);
        }

        else if (n2<n1 && n2<n3)
        {
            System.out.println("n2 is the smallest: "+n2);
        }

        else
        {
            System.out.println("n3 is the smallest: "+n3);
        }
    }
}
