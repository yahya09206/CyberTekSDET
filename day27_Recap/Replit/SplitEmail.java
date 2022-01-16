package day27_Recap.Replit;

import java.util.Scanner;

public class SplitEmail {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        String[] str = email.split("@");

        if (str.length == 2){
            System.out.println("Email id: " + str[0]);
            System.out.println("Email domain: " + str[1]);
        }else if (str.length>2 || str.length==1){
            System.out.println("invalid email");
        }

    }
}
