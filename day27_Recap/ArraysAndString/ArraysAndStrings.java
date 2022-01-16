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


        for (String element : str2) {
            String reverse = "";
            for (int i = element.length() - 1; i >= 0; i--){
                reverse += element.charAt(i);
            }
            System.out.println(reverse);
        }
    }
}
