package day22_Recap.Replit;

import java.util.Scanner;

public class Inhabitants {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day = 0;

        if (inhabitants != 0){
            do {
                System.out.println("Day " + day + " [" + inhabitants + "]");
                day++;
                inhabitants /= 2;
            }while (inhabitants > 0);
                System.out.println("---- EXTINCT ----");
        }else {
            System.out.println("---- EXTINCT ----");
        }

    }
}
