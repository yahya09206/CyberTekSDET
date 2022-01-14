package day27_Recap.Replit;

import java.util.Scanner;

public class PrintFirstAndLastChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine()};


        for (int i = 0; i < words.length; i++) {
            String eachWord = words[i];
            System.out.println("" + eachWord.charAt(0) + eachWord.charAt(eachWord.length() - 1));
        }

    }
}
