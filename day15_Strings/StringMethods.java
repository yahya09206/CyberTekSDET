package day15_Strings;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Muhtar";

        char ch = str.charAt(0);
        System.out.println("ch = " + ch);

        String word = "Cybertek School";
        char ch1 = word.charAt(9);
        System.out.println(ch1);

        String word2 = "Java";
        char ch3 = word2.charAt(2);
        System.out.println("ch3 = " + ch3);
        System.out.println("----------------------------------");

        String sentence = "Hello everyone, how are you all today?";
        int totalNumberOfChars = sentence.length();
        System.out.println("totalNumberOfChars = " + totalNumberOfChars);

        String s1 = "Cybertek";

        int lastIndex = s1.length() - 1;
        char firstCharacter = s1.charAt(0);
        char lastCharacter = s1.charAt(lastIndex);
        System.out.println("firstCharacter = " + firstCharacter);
        System.out.println("lastCharacter = " + lastCharacter);

        System.out.println("----------------------------------");
        String schoolName = "           Cybertek School      ";
        schoolName = schoolName.trim(); // "Cybertek School"
        System.out.println(schoolName);


    }
}
