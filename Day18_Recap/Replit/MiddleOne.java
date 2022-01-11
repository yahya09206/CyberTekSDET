package Day18_Recap.Replit;

import java.util.Scanner;

public class MiddleOne {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        if (word.length() >= 3 && word.length() % 2 != 0){
            System.out.println(word.charAt(word.length() / 2));
        }else if (word.length() == 1){
            System.out.println(word + word + word);
        }
    }
}
