package day23_Arrays;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {

        String str = "aabccc";
        String removeDup = "";
        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (removeDup.contains("" + ch)){
                continue;
            }
            removeDup += ch;
        }
        System.out.println("removeDup = " + removeDup);

    }
}
