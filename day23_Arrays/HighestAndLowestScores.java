package day23_Arrays;

public class HighestAndLowestScores {
    public static void main(String[] args) {

        int[] numbers = {85, 70, 95, 90, 100};
        String[] names = {"Mike", "Adam", "Tony", "John", "Amy"};

        // iterate thru arrays since they have same length
        for (int i = 0; i <= numbers.length - 1; i++){
            System.out.println(names[i] + ": " + numbers[i]);
        }

    }
}