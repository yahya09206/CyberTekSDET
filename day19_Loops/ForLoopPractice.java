package day19_Loops;

public class ForLoopPractice {
    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i++){
            System.out.print(i + " ");
        }

        System.out.println("----------------------------------------------");
        for (int i = 0; i <= 100; i++){
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------");
        for (int i = 1; i <= 100; i+=2){
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("----------------------------------------------");

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
