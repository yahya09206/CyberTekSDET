package day21_WhileDoWhile;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {

        int a = 10;
        int b = -5;
        int result = 0;

        // for negative
//        if (b < 0){
//            b *= -1;
//        }

        for (int i = 0; i < b; i++) {
            result += a;
        }
        System.out.println("result = " + result);
    }
}
