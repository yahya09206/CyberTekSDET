package day27_Recap.Replit;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftLeft {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        int[] newArr = new int[nums.length];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
            newArr[newArr.length - 1] = nums[i];
        }

        System.out.println(Arrays.toString(newArr));
    }
}
