package day27_Recap.Replit;

import java.util.Scanner;

public class PrintShortestWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next()};

        String result = str[0];
        for (int i = 0; i < str.length; i++){
            if (result.length() > str[i].length()){
                result = str[i];
            }
        }
        System.out.println(result);
    }
}
