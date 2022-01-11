package Day18_Recap.Replit;

import java.util.Scanner;

public class StringEmail {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();


        if (email.contains("_")){
            String firstHalf = email.substring(0, email.indexOf("_"));
            String secondHalf = email.substring((email.indexOf("_") + 1), email.indexOf("@"));
            System.out.println(secondHalf + "_" + firstHalf + "@gmail.com");
        }else {
            System.out.println(email);
        }

    }
}
