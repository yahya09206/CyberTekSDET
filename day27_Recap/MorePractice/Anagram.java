package day27_Recap.MorePractice;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:
     */

        String str1 = "earth";
        String str2 = "heart";

        // convert to charArray()
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);


    }
}
