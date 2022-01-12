package day22_Recap.Replit;

public class EvenFrom80To20 {
    public static void main(String[] args) {

        for(int i = 80; i >= 20; i--){
            if(i % 2 == 0){
                System.out.print(i + " ");
                if (i == 22) {
                    System.out.println(20);
                }
            }
        }
    }
}
