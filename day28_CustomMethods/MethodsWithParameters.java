public class MethodsWithParameters {
	public static void main(String[] args){

		eligible(14);
		eligible(30);
	}

	public static void eligible(int age){
		if (age >= 21) {
			System.out.println("eligible");
		}else {
			System.out.println("Not eligible");
		}

	}
}