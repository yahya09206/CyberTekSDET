package day22_Recap.Replit;

import java.util.Scanner;

public class PartyList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String list = " ";

        String countinue = "yes";

        while(countinue.equalsIgnoreCase("yes")){
            System.out.println("Please enter guest name:");
            String prompt = scan.next();
            System.out.println("Do you want to enter new guest name:");
            countinue = scan.next();
            list += prompt + ", ";

            if (countinue.equalsIgnoreCase("no")){
                System.out.println("Guest's list:" + list.substring(0, list.length() - 2));
            }
        }
    }
}
