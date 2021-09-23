public class MorningWorkOut {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 30; i++){
			System.out.println("Push-up " + i);
			
				pause(2.5);
		}

		System.out.println("-------------------------------");

		for(int i = 1; i <= 20; i++){
			System.out.println("Pull-up " + i);
			try {
				Thread.sleep(3500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

	public static void pause(double seconds) {
		long milliSeconds = (long) (seconds * 1000);
		try {
			Thread.sleep(milliSeconds);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}