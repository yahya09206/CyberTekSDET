public class ExceptionIntro {
	public static void main(String[] args) {

		int[] arr = {1,2,3};
		//ArrayIndexOutOfBoundsException
		//System.out.println(arr[100]);

		//ArithmeticException
		//System.out.println(100/0);

		//NullPointerException --> unchecked exception associated with runtime exception
		String str = null;
		//System.out.println(str.toUpperCase());
		System.out.println("Hello");

		System.out.println("---------------------------");
		//Interrupted exception
		//Thread.sleep(2000); // checked exception
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}

		//FileInputStream input = new FileInputStream("notes.txt");
		System.out.println("Hello Robinson");
	}
}