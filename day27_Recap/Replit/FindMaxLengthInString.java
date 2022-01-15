package day27_Recap.Replit;

import java.util.Scanner;

public class FindMaxLengthInString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[2];
        for(int i = 0; i < 2;  i++) {

            words[i] = input.nextLine();

        }

        String result = "";
        int j = 0;
        for (int i = 0; i < words.length; i++){
            if (words[i].length() > result.length()){
                result = words[i];
            }
        }
        System.out.println(longest);
    }
}
