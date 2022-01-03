package day20_Loops;

public class CatsAndDogs {
    public static void main(String[] args) {

        String sentence = "Cat Dog Dog Cat";

        int numberOfCats = 0;
        int numberofDogs = 0;

        for (int i = 0; i <= sentence.length() - 3; i++) {
            String each = sentence.substring(i, i + 3);
            if (each.equals("Cat")){
                numberOfCats++;
            }
            if (each.equals("Dog")){
                numberofDogs++;
            }
        }
        System.out.println("numberOfCats = " + numberOfCats);
        System.out.println("numberofDogs = " + numberofDogs);
    }
}
