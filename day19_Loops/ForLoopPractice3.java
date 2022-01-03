package day19_Loops;

public class ForLoopPractice3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 8 ; i++) {
            System.out.println("* * * * * *");
        }

        System.out.println("-------------------------------------------");
        System.out.println("* * * * * *");
        for (int i = 1; i <= 8; i++){
            System.out.println("*         *");
        }
        System.out.println("* * * * * *");

        System.out.println("-------------------------------------------");

        int sum = 0;

        for (int i = 1; i < 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
