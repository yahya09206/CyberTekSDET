package Day18_Recap;

import java.util.Scanner;

public class FirstAndLastChars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two words");
        String word1 = scan.next();
        String word2 = scan.next();

        if (word1.charAt(word1.length() - 1) == word2.charAt(0)){
            System.out.println(word1 + word2.substring(1));
        }else {
            System.out.println(word1 + word2);
        }
    }
}
