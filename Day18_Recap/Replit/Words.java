package Day18_Recap.Replit;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();

        boolean isTrue = word1.equalsIgnoreCase(word2);

        if (isTrue){
            System.out.println("word1 equals word2");
        }else {
            System.out.println("word1 does not equal word2");
        }
    }
}
