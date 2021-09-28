package day23_Arrays;

public class HighestAndLowestScores {
    public static void main(String[] args) {

        int[] numbers = {85, 70, 95, 90, 100};
        String[] names = {"Mike", "Adam", "Tony", "John", "Amy"};

        // iterate thru arrays since they have same length
//        for (int i = 0; i <= numbers.length - 1; i++){
//            System.out.println(names[i] + ": " + numbers[i]);
//        }

        // assume max/min number is stored in first index of array
        int maxScore = numbers[0];
        int minScore = numbers[0];
        // declare empty string to use later to get name relative to max/min score
        String maxName = "";
        String minName = "";

        for (int i = 0; i <= numbers.length - 1; i++){
            // store arrays into vars to use later
            String eachName = names[i];
            int eachScore = numbers[i];

            // check if each score is greater than current max[index]
            if (eachScore > maxScore){
                // assign value of each score to maxscore
                maxScore = eachScore;
                // assign value of eachname to maxname
                maxName = eachName;
            }
            // same thing as above but with finding min score
            if (eachScore < minScore){
                minScore = eachScore;
                minName = eachName;
            }
        }
        System.out.println(maxScore);
        System.out.println(maxName);
        System.out.println(minScore);
        System.out.println(minName);

    }
}