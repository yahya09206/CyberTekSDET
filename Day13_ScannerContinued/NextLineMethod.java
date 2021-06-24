import java.util.*;
public class NextLineMethod {
	public static void main(String[] args){

		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter your job title: ");
		 String jobTitle = scan.nextLine(); 

		 System.out.println("Job Title: " + jobTitle);
	}
}