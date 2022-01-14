package day27_Recap.Replit;

import java.util.Scanner;

public class PrintFirstThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            String eachWord = arr[i];
            System.out.println("" + eachWord.charAt(0) + eachWord.charAt(1) + eachWord.charAt(2));
        }
    }
}
