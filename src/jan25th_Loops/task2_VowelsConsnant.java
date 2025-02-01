package jan25th_Loops;

public class task2_VowelsConsnant {
    public static void main(String[] args) {
       // Count vowels and consonants in a String.  -pramod, → vowels - 2,
        // consnants - 4

        String  name = "Pramod";
        //int slength =name.length();
        //System.out.println(slength);
        int vcount=0;
        int ccount=0;

        for (int i=0;i<name.length();i++)
        {
            char ch = name.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vcount++;
            }
            else {
                ccount++;
            }
        }
        System.out.println("Vowels "+vcount);
        System.out.println("Consonant "+ccount);

    }
}
