import java.util.Arrays;
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
		int[] array1 = {1,2,3,4},
			  array2 = {5,6,7,8};
		mergeTwoArray(array1, array2);

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

	//method to merge any two arrays
	public static void mergeTwoArray(int[] arr1, int[] arr2){
		int[] arr3 = new int[arr1.length + arr2.length];
		int i = 0;
		for (int each : arr1) {
			arr3[i++] = each;
		}

		for (int each : arr2) {
			arr3[i++] = each;
		}
		System.out.println(Arrays.toString(arr3));
	}

	//method to print out full name regardless of case
	public static void formatFullName(String firstName, String lastName){

		firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
		lastName = lastName.substring(0,1).toUpperCase() + lastName.substrinlasttoLowerCase();

		String fullName = firstName + lastName;
		System.out.println("fullName = " + fullName);


	}
}