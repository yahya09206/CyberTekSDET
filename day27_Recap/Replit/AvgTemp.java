package day27_Recap.Replit;

import java.util.Scanner;

public class AvgTemp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };


        double sum = 0;

        for (int i = 0; i <= temps.length - 1; i++){
            sum += temps[i];
        }

        System.out.println(sum);
        double average = sum / temps.length;
        System.out.println(average);
    }
}
