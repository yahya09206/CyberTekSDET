package Day18_Recap;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter word: ");
        String word = scan.next();

        if (word.startsWith("x")){
            System.out.println(word.substring(1));
        }else {
            System.out.println(word);
        }
    }
}
