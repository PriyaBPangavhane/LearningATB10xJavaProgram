package ternaryOperator;

public class Lab005_maxTerneryOp {
    //Take a user input 2 numbers from the arguments and calculate the maximum
    // in between with ternary operator.
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int max = (a>b)?a:b;

        System.out.println("Max is :"+max );


    }


}
