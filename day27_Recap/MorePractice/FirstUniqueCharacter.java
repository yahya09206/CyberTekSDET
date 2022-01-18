package day27_Recap.MorePractice;

public class FirstUniqueCharacter {
    public static void main(String[] args) {

        System.out.println(firstNonRepeatedChar("aaaaabbbcdddeee"));
    }
    /*
    write a program that can return the first non-repeated character from a string
     */
    public static char firstNonRepeatedChar(String str){

        // loop to go thru whole string
        for (int i = 0; i <= str.length() - 1; i++) {
            int frequency = 0;
            // loop to go thru each char
            for (int j = 0; j <= str.length() - 1; j++) {
                // compare at each index
                if (str.charAt(i) == str.charAt(j)){
                    // add to freq if equal
                    frequency++;
                }
            }
            // return if only one occurrence
            if (frequency == 1){
                return str.charAt(i);
            }
        }
        return ' ';
    }
}
