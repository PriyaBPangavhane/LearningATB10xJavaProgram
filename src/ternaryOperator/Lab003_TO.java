package ternaryOperator;

public class Lab003_TO {
    //Find Largest number between two numbers X & Y using Ternery Operator
    public static void main(String[] args) {

        int x=10;
        int y=20;

        int max = x>y? x:y;
        //String max = x>y? "X is Max" : "Y is Max"; //it will print a string
        System.out.println(max);

    }
}
