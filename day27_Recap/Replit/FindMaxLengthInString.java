package day27_Recap.Replit;

import java.util.Scanner;

public class FindMaxLengthInString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        String longest = words[0];

        for (int i = 0; i <= words.length - 1; i++){
            if (longest.length() > words[i].length()){
                longest = words[i];
            }
        }
        System.out.println(longest);
    }
}
