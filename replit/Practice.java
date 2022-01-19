package replit;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        System.out.println("In:");
        int num = inp.nextInt();

        if(num > 0){
            System.out.println(num + " is positive");
        }else {
            System.out.println(num + " is negative");
        }

        System.out.println("-----------------------------------------");

        int n1 = inp.nextInt();
        int n2 = inp.nextInt();
        int n3 = inp.nextInt();

        if (n1 > n2 && n1 > n3){

        }else if (n2 > n1 && n2 > n3){

        }
    }
}
