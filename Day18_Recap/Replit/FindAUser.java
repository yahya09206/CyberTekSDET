package Day18_Recap.Replit;

import java.util.Scanner;

public class FindAUser {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");
        String name = scan.nextLine();

        boolean nameFound = name.equalsIgnoreCase("Max Payne") || name.equalsIgnoreCase("Alan Wake");

        if (nameFound){
            System.out.println("User found!");
        }else {
            System.out.println("User not found!");
        }

    }
}
