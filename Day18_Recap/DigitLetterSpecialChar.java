package Day18_Recap;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();
        char f = word.charAt(0);

        String result = "First character is ";

        if (f >= '0' && f <= '9'){
            result += "a digit";
        }else if (f >= 'a' && f <= 'z'){
            result += "a lowercase letter";
        }else if (f >= 'A' && f <= 'Z'){
            result += "a uppercase letter";
        }else {
            result += "Starts with special character";
        }

    }
}
