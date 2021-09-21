public class ThrowsKeyword {
	public static void main(String[] args) throws InterruptedException{

		System.out.println("test started");
		System.out.println("Step 1");
		sleep(2.5);

		System.out.println("Step 2");
		sleep(2.5);

		System.out.println("test completed");
	}

	// public static void sleep(double seconds) throws InterruptedException{

	// 	long milliSeconds = (long) (seconds * 1000);
	// 	Thread.sleep(milliSeconds);
	// }

	public static void sleep(double seconds) throws InterruptedException{

		long milliSeconds = (long) (seconds * 1000);
		try {
			Thread.sleep(milliSeconds);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}