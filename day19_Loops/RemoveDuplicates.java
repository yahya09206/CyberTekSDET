package day19_Loops;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String word = "aabbc";

        String result = "";

//        if (!result.contains("" + word.charAt(0))){
//            result += word.charAt(0);
//        }
//
//        if (!result.contains("" + word.charAt(1))){
//            result += word.charAt(1);
//        }
//
//        if (!result.contains("" + word.charAt(2))){
//            result += word.charAt(2);
//        }
//
//        if (!result.contains("" + word.charAt(3))){
//            result += word.charAt(3);
//        }
//
//        if (!result.contains("" + word.charAt(4))){
//            result += word.charAt(4);
//        }

        for (int i = 0; i <= word.length() - 1; i++){
            if (!result.contains("" + word.charAt(i))){
                result += word.charAt(i);
            }
        }
        System.out.println(result);
    }
}