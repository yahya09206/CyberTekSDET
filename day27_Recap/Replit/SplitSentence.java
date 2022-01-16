package day27_Recap.Replit;

import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] str = sentence.split(" ");

        for (int i = 0; i <= str.length - 1; i++){
            System.out.println(str[i]);
        }

    }
}
