import java.util.Scanner;
public class YesOrNo {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Will you marry me?");
		String answer = scan.next().toLowerCase();

		if(!(answer.equals("yes") || answer.equals("no"))){
			System.out.println("Invalid Entry, please re-enter");
			answer = scan.next().toLowerCase();
		}

		if(answer.equals("yes")){
			System.out.println("Congrats");
		}

		if(answer.equals("no")){
			System.out.println("RIP");
		}

		scan.close();

	}
}