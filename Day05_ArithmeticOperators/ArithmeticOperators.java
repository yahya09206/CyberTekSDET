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

	}
}