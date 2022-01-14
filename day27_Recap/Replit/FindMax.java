package day27_Recap.Replit;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt()};

        int max = nums[0];

        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println(max);
    }
}
