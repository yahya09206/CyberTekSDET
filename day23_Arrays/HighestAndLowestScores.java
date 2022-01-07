package day23_Arrays;

public class HighestAndLowestScores {
    public static void main(String[] args) {

        int[] numbers = {85, 70, 95, 90, 100};
        String[] names = {"Mike", "Adam", "Tonny", "John", "Ammy"};
        int highest = numbers[0];
        String maxName = "";

        int minScore = numbers[0];
        String minName = "";


        for (int i = 0; i <= numbers.length - 1; i++) {
            String eachName = names[i];
            int eachScore = numbers[i];
            if (eachScore > highest){
                highest = eachScore;
                maxName = eachName;
            }

            if (eachScore < minScore){
                minScore = eachScore;
                minName = eachName;
            }
        }
        System.out.println(highest + ", " + maxName);
        System.out.println(minScore + ", " + minName);
    }
}