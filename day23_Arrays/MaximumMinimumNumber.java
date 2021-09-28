package day23_Arrays;

public class MaximumMinimumNumber {
    public static void main(String[] args) {

        int[] nums = {10, 5, 4, 400, 50, 0, -1};
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i <= nums.length - 1; i++){
            int each = nums[i];
            if (each > max){
                max = each;
            }
            if (each < min){
                min = each;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}