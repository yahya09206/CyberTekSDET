public class ThrowsKeyword {
	public static void main(String[] args) throws InterruptedException{

	}

	public static void sleep(double seconds){
		long milliSeconds = long (seconds * 1000);
		Thread.sleep(milliSeconds);
	}
}