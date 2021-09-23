import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {
	public static void main(String[] args) {
		
		String str = "Cybertek";

		try {
			System.out.println(str.charAt(200));
			System.out.println("Try block");
		}catch (StringIndexOutOfBoundsException e){
			System.out.println("Catch Block: String index out of bound exception occured");
		}

		str += "School";

		System.out.println(str);

		System.out.println("--------------------------------");

		try {
			System.out.println(9/0);
		}catch (IllegalArgumentException e){
			System.out.println("IllegalArgumentException");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (IndexOutOfBoundsException e){
			System.out.println("IndexOutOfBoundsException");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (ArithmeticException e){
			//System.out.println("ArithmeticException");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (RuntimeException e){
			System.out.println("RuntimeException");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("Test completed");
		System.out.println("--------------------------------");

		try {
			System.out.println(new Scanner(System.in).nextInt());
		}catch (ArithmeticException e){
			e.printStackTrace();
		}catch (NumberFormatException e){
			e.printStackTrace();
		}catch (IllegalArgumentException e){
			e.printStackTrace();
		}catch (InputMismatchException e){
			e.printStackTrace();
		}catch (RuntimeException e){
			e.printStackTrace();
		}
		System.out.println("test completed");
	}
}