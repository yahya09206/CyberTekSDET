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
            System.out.println("n1 is bigger");
        }else if (n2 > n1 && n2 > n3){
            System.out.println("n2 is bigger");
        }else if (n3 > n1 && n3 > n2){
            System.out.println("n3 is bigger");
        }

        System.out.println("-----------------------------------------");
        System.out.println("Enter your command:");
        char char1 = inp.next().charAt(0);

        switch (char1){
            case 'y':
                System.out.println("");
                break;
            case 'n':
                System.out.println("");
                break;
            case 'h':
                System.out.println("");
                break;
            default:
                System.out.println("");
                break;
        }


    }
}
