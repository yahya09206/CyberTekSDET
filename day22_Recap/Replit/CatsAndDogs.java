package day22_Recap.Replit;

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        int wordcharCount = word.length();
        int tCharCount = 3; // character count of target word we are looking for

        for (int i = 0; i <= wordcharCount - tCharCount; i++){
            String currentWord = word.substring(i, i + tCharCount);
            if (currentWord.equals("cat")){
                countOfCats++;
            }else if (currentWord.equals("dog")){
                countOfDogs++;
            }
        }

        System.out.println(countOfCats == countOfDogs);

    }
}
