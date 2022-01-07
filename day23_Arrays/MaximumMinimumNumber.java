package day23_Arrays;

public class MaximumMinimumNumber {
    public static void main(String[] args) {

        int[] numbers = {1,60,22,-2,5};
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i <= numbers.length - 1; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }else if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}