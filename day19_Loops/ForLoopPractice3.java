package day19_Loops;

import java.util.Scanner;

public class ForLoopPractice3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 8 ; i++) {
            System.out.println("* * * * * *");
        }

        System.out.println("-------------------------------------------");
        System.out.println("* * * * * *");
        for (int i = 1; i <= 8; i++){
            System.out.println("*         *");
        }
        System.out.println("* * * * * *");

        System.out.println("-------------------------------------------");
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("-------------------------------------------");


    }
}
