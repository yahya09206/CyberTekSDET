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
		System.out.println("------------------------------------------");
		formatFullName("CybErTEK", "SCHooL");
		System.out.println("------------------------------------------");
		printMaxNumber(4,5);

		System.out.println("------------------------------------------");
		int[] array = {10,4,5,63,56,3,1};
		sortDesc(array);

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
		lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

		String fullName = firstName + " " + lastName;
		System.out.println("fullName = " + fullName);
	}

	//method to print out max between two numbers
	public static void printMaxNumber(int num1, int num2){
		System.out.println(num1 > num2 ? num1 : num2 + " is maximum number");
	}

	//method to print out array of integers in descending order
	public static void sortDesc(int[] arr){
		Arrays.sort(arr);
		int[] result = new int[arr.length];
		for (int i = arr.length - 1, j = 0; i >= 0; i--, i++) {//reversing array
			result[j] = arr[i];
		}
		System.out.println(Arrays.toString(result));
	}
}