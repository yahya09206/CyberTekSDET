package day27_Recap.Replit;

import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstAndLastChar2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine()};

        String[] chars = new String[words.length];

        for (int i = 0; i < words.length - 1; i++) {
            String eachWord = words[i];
            chars[i] = "" + words[eachWord.charAt(0) + eachWord.charAt(eachWord.length() - 1)];
            //System.out.println("" + eachWord.charAt(0) + eachWord.charAt(eachWord.length() - 1));
        }
        Arrays.toString(newArr);

    }
}
