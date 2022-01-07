package day23_Arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter which month to print");
        int month = scan.nextInt();
        String[] nameOfMonth = {"January", "February", "March", "April", "May", "June", "July", "August", "September"
                , "October", "November", "December"};

        System.out.println(nameOfMonth[month]);


    }
}
