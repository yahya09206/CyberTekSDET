package day23_Arrays;

public class HighestAndLowestScores {
    public static void main(String[] args) {

        int[] grades = {85, 70, 95, 90, 100};
        String[] names = {"Mike", "Adam", "Tommy", "John", "Ammy"};

        int maxScore = grades[0];
        String maxName = "";

        for (int i = 0; i <= grades.length - 1; i++){
            String eachName = names[i];
            int eachScore = grades[i];
            if (eachScore > maxScore){
                maxScore = eachScore;
                maxName = eachName;
            }
        }
        System.out.println(maxScore);
        System.out.println(maxName);

    }
}