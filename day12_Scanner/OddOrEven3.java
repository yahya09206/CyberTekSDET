import java.util.*;
public class OddOrEven3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        System.out.println((number % 2 != 0)? "Odd": "Even");
        System.out.println((number > 0)? "Positive": (number < 0)? "Negative": "Zero");
    }


}