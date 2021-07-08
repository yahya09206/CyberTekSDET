import java.util.Scanner;
public class YesOrNo {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Will you marry me?");
		String answer = scan.next().toLowerCase();
	}
}