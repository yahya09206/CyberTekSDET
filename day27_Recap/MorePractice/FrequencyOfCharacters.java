package day27_Recap.MorePractice;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

    }

    public static String frequencyOfChars(String str){
        String result = "";

        for (int i = 0; i <= str.length() - 1; i++){
            int frequency = 0;
            for (int j = 0; j <= str.length() - 1 ; j++) {
                if (str.charAt(i) == str.charAt(j)){
                    result += str.charAt(i);
                }
            }

        }

        return result;
    }
}
