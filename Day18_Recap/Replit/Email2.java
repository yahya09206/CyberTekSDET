package Day18_Recap.Replit;

import java.util.Scanner;

public class Email2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName = email.substring(0, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));

        System.out.println("First name: " + firstName.toUpperCase().charAt(0) + email.substring(1, email.indexOf("_")));
        System.out.println("Last name: " + lastName.toUpperCase().charAt(0) + email.substring(email.indexOf("_") + 2, email.indexOf("@")));
        System.out.println("Domain: " + email.substring(email.indexOf("@") + 1, email.indexOf(".")));

    }
}
