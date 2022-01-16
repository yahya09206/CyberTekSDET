package day27_Recap.ArraysAndString;

public class ArraysAndStrings {
    public static void main(String[] args) {

        String str = "Java is fun";
        String[] str2 = {"Java is fun"};


        String result = "";

        for (int i = str.length() - 1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);


        String[] result2 = new String[str2.length];
        for (int i = str2.length - 1, j = 0; i >= 0; i--){
            result2[j++] += str2[i];
        }
        System.out.println(result2);

    }
}
