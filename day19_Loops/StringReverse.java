package day19_Loops;

public class StringReverse {
	public static void main(String[] args){

		String name = "Muhtar";
		String result = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			result += name.charAt(i);
		}
		System.out.println("result = " + result);

	}
}