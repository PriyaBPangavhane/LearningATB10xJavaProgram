package ternaryOperator;

public class Lab01_TerneryOperator {
    public static void main(String[] args) {

        int a = 10;

        System.out.println(++a + a++ + a++);//(11+12+13)=34 Pre-increment (++a) increases the value before using it.
                                            //Post-increment (a++) uses the current value first, then increments it.
                                            // The evaluation follows left-to-right order.

        System.out.println(a);
    }
}
