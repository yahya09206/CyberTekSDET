package Day18_Recap;

public class StringMethodsPractice {
    public static void main(String[] args) {

        String str = "abcd";
        int indexOfK = str.indexOf("k");

        System.out.println("indexOfK = " + indexOfK);

        if (indexOfK >= 0){
            System.out.println("The string has character k");
        }else {
            System.out.println("The string does not have character k");
        }

        System.out.println("---------------------------------------------");
        String sentence = "I like to learn C#, C# is cool";

        if (sentence.indexOf("J") >= 0){
            System.out.println("Sentence has java");
        }else {
            System.out.println("Sentence does not have java");
        }
    }
}
