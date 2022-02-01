package day23_Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        String[] names = {"Gulistan", "Saron", "Aykut", "Kadir", "Yilmaz"};

        // retrieve data from array
        System.out.println(names[1]);

        for (int i = 0; i <= names.length - 1; i++){
            System.out.println(names[i]);
        }
    }
}
