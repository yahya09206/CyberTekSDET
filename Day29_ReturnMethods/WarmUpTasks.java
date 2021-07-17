public class WarmUpTasks {
	public static void main(String[] args){

		posNegZero(-10);
		posNegZero(10);
		posNegZero(0);

		int[] numbers = {10,20,0,-30, -5};

		for (int number : numbers ) {
			posNegZero(number);
		}

		System.out.println("------------------------------------------");

	}


	//method to check if integer is positive, negative or zero
	public static void posNegZero(int number){

		//check if number is positive
		if (number > 0) {
			System.out.println(number + " is positive number");
		}else if(number < 0){
			System.out.println(number + " is negative number");
		}else {
			System.out.println(number + " is zero");
		}
	}

	public static void mergeTwoArray(int[] arr1, int[] arr2){
		int[] arr3 = new int[arr1.length + arr2.length];
	}
}