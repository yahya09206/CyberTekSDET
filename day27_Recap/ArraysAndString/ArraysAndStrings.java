package day27_Recap.ArraysAndString;

public class ArraysAndStrings {
    public static void main(String[] args) {

        String str = "Java is fun";


        String result = "";
        String[] result2 = str.split(" ");

        for (int i = str.length() - 1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);

    }
}
