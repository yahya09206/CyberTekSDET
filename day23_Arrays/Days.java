package day23_Arrays;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Enter number from 1-7");
        int num = scan.nextInt();

        if (num >= 1 && num <= 7){
            System.out.println(days[num - 1]);
        }else {
            System.out.println("Invalid Number");
        }
    }
}
