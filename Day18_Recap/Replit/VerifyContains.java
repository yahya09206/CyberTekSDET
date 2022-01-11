package Day18_Recap.Replit;

import java.util.Scanner;

public class VerifyContains {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        boolean itContains = sentence.contains(word);

        System.out.println("itContains = " + itContains);

//        if(sentence.contains(word)){
//            return true;
//        }else {
//            return false;
//        }
    }
}
