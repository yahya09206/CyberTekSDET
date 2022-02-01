package day23_Arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "November", "December",};

        System.out.println("Please choose a number between 1-12");
        int userMonth = scan.nextInt();

        if (userMonth >= 1 && userMonth <= 12){
            System.out.println(months[userMonth]);
        }else {
            System.out.println("Invalid Number");
        }
    }
}
