package day23_Arrays;

public class MaximumMinimumNumber {
    public static void main(String[] args) {

        int[] maxNumber = {1,60,22,44,5};
        int max = 0;
        int min = 0;

        for (int i = 0; i <= maxNumber.length - 1; i++){
            if (maxNumber[i] > max){
                max = maxNumber[i];
            }else if (maxNumber[i] < min){
                min = maxNumber[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}