package Day18_Recap.Replit;

import java.util.Scanner;

public class HasAJava {
    public static void main(String[] args) {

        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.startsWith("java") || word.substring(1).startsWith("java")) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
