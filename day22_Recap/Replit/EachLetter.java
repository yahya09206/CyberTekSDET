package day22_Recap.Replit;

import java.util.Scanner;

public class EachLetter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        for (int i = 0; i <= word.length() - 1; i++){
            System.out.println(word.charAt(i));
        }

    }
}
