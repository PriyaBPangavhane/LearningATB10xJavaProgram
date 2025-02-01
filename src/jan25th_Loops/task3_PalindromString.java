package jan25th_Loops;

public class task3_PalindromString {
   // Palidrome of String (chatAt()) -
   // naman, → reverse - naman , madam ( string = rev(str)

    public static void main(String[] args) {

        String str = "Ram";
        String str1="";
        int slength=str.length();

        for (int i=slength-1; i>=0;i--) {

            str1 += str.charAt(i);
        }
            if(str.equals(str1))
            {
                System.out.println("String is palindrome");
            }
            else
            {
                System.out.println("String is not palindrome");
            }



    }
}
