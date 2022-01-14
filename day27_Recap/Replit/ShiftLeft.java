package day27_Recap.Replit;

import java.util.Scanner;

public class ShiftLeft {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];

        int[] newArr = new int[nums.length];
        for (int i = 0; i <= nums.length - 1; i++) {
            nums[i] = nums[nums.length - 1];
        }
    }
}
