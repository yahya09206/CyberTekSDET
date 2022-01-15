package day27_Recap.Replit;

import java.util.Scanner;

public class PrintFirstAndLastChar2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        String[] newArr = new String[words.length];
        int j = 0;
        for (int i = 0; i < words.length; i++) {
            String eachWord = words[i];
            newArr[j++] = words[eachWord.charAt(0) + eachWord.charAt(eachWord.length() - 1)];
            //System.out.println("" + eachWord.charAt(0) + eachWord.charAt(eachWord.length() - 1));
        }

    }
}
