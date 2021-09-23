public class ArithmeticOperators {
	public static void main(String[] args){
		System.out.println(25 / 2);
		System.out.println(25.0 / 2);
		System.out.println(25 / 2.0);
		System.out.println(25d / 2);
		//Will cause exception
		//System.out.println(10 / 0);
		int a = 100 / 3;
		System.out.println("a = " + a);

		double b = 100 / 3;
		System.out.println("b = " + b);

		double c = 100.0 / 3;
		System.out.println("c = " + c);

		System.out.println("-------------------------");
		int n1 = 100;
		int n2 = 40;

		//10/4 ==> 2.5
		//remainder: 10 - (4 * 2) = 2;
		//numerator - (denominator * integer number of result)
		System.out.println(n1 % n2);

		//Division Calculator challenge
		int num1 = 4;
		int num2 = 20;
		int result = num2 / num1;
		System.out.println(result);

		num1 = 9;
		num2 = 20;
		result = num2 / num1;
		System.out.println(result);

	}
}