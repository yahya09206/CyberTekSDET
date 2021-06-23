import java.util.*;
public class OddOrEven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        System.out.println((number % 2 != 0)? "Odd": "Even");
    }


}