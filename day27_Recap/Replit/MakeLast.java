package day27_Recap.Replit;

import java.util.Scanner;

public class MakeLast {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }

        int[] newNums = new int[nums.length * 2];
        newNums[nums.length - 1] = nums[nums.length - 1];

    }
}
