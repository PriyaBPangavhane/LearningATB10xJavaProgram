package jan30th_Tasks;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 sides:");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if(side1+side2>side3 &&side2+side3>side1 && side1+side3>side2)
        {
            System.out.println("Valid Triangle");
        } else if (side1==side2||side2==side3||side1==side3)
        {
            System.out.println("It is an Isosceles Triangle");
        }
        else if (side1!=side2 && side2!=side3 && side1!=side3)
                {
                    System.out.println("It is a Scalene Triangle");
                }
        else
        {
            System.out.println("Its not a valid triangle");
        }
    }

    }

