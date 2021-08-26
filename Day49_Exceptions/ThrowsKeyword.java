public class ThrowsKeyword {
	public static void main(String[] args) throws InterruptedException{

		System.out.println("Test started");
		System.out.println("Step 1");
		sleep(2.5);

		System.out.println("Step 2");
		slee(2.5);

		System.out.println("test Completed");
	}

	// public static void sleep(double seconds) throws InterruptedException {

	// 	long milliSeconds = long (seconds * 1000);
	// 	Thread.sleep(milliSeconds);
	// }

	public static void sleep(double seconds){

		long milliSeconds = long (seconds * 1000);
		try {
			Thread.sleep(milliSeconds);
		}catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}