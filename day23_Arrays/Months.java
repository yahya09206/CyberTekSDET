package day23_Arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] months = {"January", "Febraury", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        System.out.println("Enter a number from 1-12");
        int num = scan.nextInt();

        System.out.println(months[num-1]);



    }
}
