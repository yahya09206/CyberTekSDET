package day27_Recap.Replit;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftLeft {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];

        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        int[] newArr = new int[nums.length];
        newArr[newArr.length] = nums[0];
        System.out.println(Arrays.toString(nums));
    }
}
