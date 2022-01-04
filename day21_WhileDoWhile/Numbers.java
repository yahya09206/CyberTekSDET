package day21_WhileDoWhile;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        int n = new Scanner(System.in).nextInt();

        if (n <= 0){
            System.exit(0);
        }

        String result1 = "Divisble by 15";
        String result2 = "Divisible by 5";
        String result3 = "Divisible by 3";

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("Hello");
    }
}
