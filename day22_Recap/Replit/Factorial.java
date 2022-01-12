package day22_Recap.Replit;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long result = 1L;

        for (int i = 1; i <= n; i++){
            n *= i;
        }

        System.out.println(result);
    }
}
