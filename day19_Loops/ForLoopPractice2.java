package day19_Loops;

public class ForLoopPractice2 {
    public static void main(String[] args) {

        for (int i = 65; i <= 90; i++){
            System.out.print((char)i + " ");
        }
        System.out.println();

        System.out.println("----------------------------------------------");

        for (char i = 'A'; i < 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("----------------------------------------------");
        //reverse alphabet
        for (char i = 'Z'; i >= 'A' ; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
