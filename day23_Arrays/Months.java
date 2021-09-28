package day23_Arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] months = {"January", "Febraury", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        System.out.println("Enter a number from 1-12");
        int num = scan.nextInt();

        System.out.println(months[num-1]);


        System.out.println("------------------------------------------");
        // print numbers only divisible by 2
        int[] nums = {12,34,2,123,455,3345,32334,554,100,40};

        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                System.out.println(nums[i]);
            }
        }

        System.out.println("------------------------------------------");
        // print every other number from array
        int[] nums2 = {12,34,2,123,455,3345,32334,554,100,40};
        for (int i = 0; i < nums2.length; i++){
            System.out.println(nums2[i]);
        }

    }
}
