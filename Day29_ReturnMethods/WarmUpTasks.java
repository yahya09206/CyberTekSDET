public class WarmUpTasks {
	public static void main(String[] args){

		posNegZero(-10);
		posNegZero(10);
		posNegZero(0);

		int[] number = {10,20,0,-30, -5};
		

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
}