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
            if (i % 15 == 0){
                result1 += i + " ";
            }else if (i % 5 == 0){
                result2 += i + " ";
        }else if (i % 3 == 0){
                result3 += i + " ";
            }
        System.out.println(result1);
    }
}
