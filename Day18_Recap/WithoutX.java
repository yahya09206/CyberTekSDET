package Day18_Recap;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter word: ");
        String word = scan.next();

        if (word.toLowerCase().startsWith("x")){
            System.out.println(word.substring(1));
        }else {
            System.out.println(word);
        }

        scan.close();

        System.out.println("---------------------------------------------");
        String sentence = "I love Java programming language";

        //java or Java ==> has Java
        //otherwise ==> does not have Java
        if (sentence.toLowerCase().contains("java")){
            System.out.println("Has java");
        }else {
            System.out.println("Does not have java");
        }

        System.out.println("---------------------------------------------");
        String s1 = "I love cats and dogs";
        boolean lovesCats = sentence.toLowerCase().contains("cats");

        if (sentence.toLowerCase().contains("cats")){
            System.out.println("Person loves cats");
        }else {
            System.out.println("Person does not love cats");
        }
    }
}
