package day20_Loops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= num; i++){
            result *= i;
        }
        System.out.println(result);

    }
}
