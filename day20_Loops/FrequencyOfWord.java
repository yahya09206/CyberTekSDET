package day20_Loops;

public class FrequencyOfWord {
    public static void main(String[] args) {

        int frequency = 0;
        String sentence = "Java Java";
        /*
        String str = sentence.substring(0, 4);
        String str2 = sentence.substring(1, 5);
        String str3 = sentence.substring(2, 6);
        String str4 = sentence.substring(3, 7);
        String str5 = sentence.substring(4, 8);
       */

        for (int i = 0; i <= sentence.length() - 4; i++) {
            String each = sentence.substring(i, i + 4);
            if (each.equals("Java")){
                frequency++;
            }
        }
        System.out.println("frequency = " + frequency);

    }
}
