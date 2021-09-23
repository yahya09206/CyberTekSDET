import java.util.*;
public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your hourly rate: ");
        double hourlyRate = scan.nextDouble();

        System.out.print("How many hours do you work in a week? ");
        int hours = scan.nextInt();

        System.out.print("How many weeks do you work in a year? ");
        int weeks = scan.nextInt();

        double salary = hourlyRate * hours * weeks;

        System.out.println("You are making $" + hourlyRate + "/hr");
        System.out.println("You work " + hours + "/week");
        System.out.println("Your salary is $" + salary);

    }
}