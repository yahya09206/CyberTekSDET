package day27_Recap.Replit;

import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }

        if (num.length < 2){
            System.out.println(Arrays.toString(num));
        }else {
            int[] newNum = new int[2];
            newNum[0] = num[0];

        }
    }
}
