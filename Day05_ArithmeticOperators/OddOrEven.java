public class OddOrEven {
	public static void main(String[] args){
		//check remainder
		int number = 100;
		boolean isEven = number  % 2 == 0; //if the remainder of number / 2 is equal to 0
		boolean isOdd = number % 2 > 0;
		System.out.println(isEven);
		System.out.println(isOdd);

		number = 300;
		boolean isEvenlyDivisible = (number % 3 == 0);
		System.out.println(number + " is evenly divisible by 3: " + isEvenlyDivisible);
	}
}