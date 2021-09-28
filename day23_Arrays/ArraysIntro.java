package day23_Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        String[] groupTwo = {"Yahya", "Ahmet", "Ahmad", "Gulistan", "Kadir", "Igor", "Aykut", "Saron", "Ateequllah",
                "Feruza", "Nazli"};

        // print in reverse
        for(int i = groupTwo.length - 1; i > 0; i--){
            System.out.println(groupTwo[i]);
        }
        System.out.println("------------------------------------------");
        // print regular
        for (int i = 0; i <= groupTwo.length - 1; i++){
            System.out.println(groupTwo[i]);
        }
    }
}
