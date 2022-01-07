package day23_Arrays;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println("Enter a number");
        int n = new Scanner(System.in).nextInt();

        System.out.println(days[n-1]);

    }
}
