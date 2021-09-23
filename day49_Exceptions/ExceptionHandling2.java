import java.io.FileInputStream;

public class ExceptionHandling2 {
	public static void main(String[] args) {

		// try {
		// 	FileInputStream file = new FileInputStream("");
		// }catch (FileNotFoundException e){
		// 	e.printStackTrace();
		// }

		System.out.println("Test Completed");
		System.out.println("--------------------------");

		try {
			Thread.sleep(5000);
		}catch (InterruptedException e){
			e.printStackTrace();
		}

		System.out.println("Test Completed");

		System.out.println("--------------------------");

		try {
			System.out.println(100 / 0);
			System.out.println("Try Block");
		}catch (ArithmeticException e){
			System.out.println("Catch Block");
		}finally {
			System.out.println("Finally Block");
		}
	}
}