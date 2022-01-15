package day27_Recap.Replit;

import java.util.Scanner;

public class PrintShortestWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        String result = "";
        for (int i = 0; i < str.length; i++){
            if (str[i].length() < result.length()){
                result = str[i];
            }
        }
        System.out.println(result);
    }
}
