package Task_16th_Feb_OOp_Abstraction;

public class PrintMyBook extends Book{
    public static void main(String[] args) {
        Book myBook = new PrintMyBook();
        myBook.getDetails("Harry Potter", "J.k. Rowling", 120);
    }


    @Override
    void getDetails(String name, String author, int price) {
        System.out.println(name+","+author+","+price);
    }
}
