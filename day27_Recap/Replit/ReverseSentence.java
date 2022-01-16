package day27_Recap.Replit;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] str = sentence.split(" ");
        String reverse = "";

        for (int i = str.length - 1; i >= 0; i--) {
            reverse += str[i] + " ";
        }
        System.out.println(reverse.substring(0,(reverse.length()-1)));
    }
}
