package Day18_Recap.Replit;

import java.util.Scanner;

public class StringNoEnd {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String txt = s.next();

        //your code here
        int word = txt.length() - 1;
        String result = txt.substring(0, word);
        System.out.println(result);

    }
}
