package Day18_Recap.Replit;

import java.util.Scanner;

public class GetSandwich {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.indexOf("bread") != word.lastIndexOf("bread")) {
            System.out.println(word.substring(word.indexOf("bread") + 5, word.lastIndexOf("bread")));
        }else {
            System.out.println("nothing");
        }
    }
}
