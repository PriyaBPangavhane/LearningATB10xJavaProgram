package Task_16th_Feb_OOp_Abstraction;

public class PrintMyBook extends Book{

    @Override
    void getDetails(String name, String author, int price) {
        System.out.println(name+","+author+","+price);
    }
}
