package day20_Loops;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        String sentence = "Python Python Python Python";
        int count = 0;

        for (int i = 0; i <= sentence.length() - 6; i++) {
            String each = sentence.substring(i, i + 6);
            if (each.equals("Python")){
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
