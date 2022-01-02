package Day18_Recap;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();
        char f = word.charAt(0);

        if (f >= '0' && f <= '9'){
            System.out.println("First character is a digit");
        }

    }
}
