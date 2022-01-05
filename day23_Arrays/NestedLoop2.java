package day23_Arrays;

public class NestedLoop2 {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++){
            for (int j = 0; j <= 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");

        for (int i = 0; i <= 7; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
