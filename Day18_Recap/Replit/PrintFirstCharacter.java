package Day18_Recap.Replit;

import java.util.Scanner;

public class PrintFirstCharacter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word.substring(0,1));
        System.out.println(word.charAt(0));
    }
}
