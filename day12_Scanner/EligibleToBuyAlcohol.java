import java.util.*;
public class EligibleToBuyAlcohol {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        if(age >= 21){
            System.out.println("You are eligible to alcohol");
        }else {
            System.out.println("Get out!");
        }

    }

}
