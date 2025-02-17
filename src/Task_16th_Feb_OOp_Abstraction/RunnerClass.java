package Task_16th_Feb_OOp_Abstraction;

public class RunnerClass {
    public static void main(String[] args) {
        Book myBook = new PrintMyBook();
        myBook.getDetails("Harry Potter", "J.k. Rowling", 120);
    }
}
