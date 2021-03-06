public class LoopsReview {
	public static void main(String[] args){
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		System.out.println("-----------------------------------");

		//using for loop
		for(int i = 1; i < 11; i++){
			System.out.print(i + " ");	
		}
		System.out.println();

		System.out.println("-----------------------------------");
		//print only even numbers from 1-20
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("-----------------------------------");
		String str = "Java";

		for (int i = 0; i <= str.length() - 1; i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println();
		//reverse order
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i) + " ");
		}

		System.out.println();
		System.out.println("-----------------------------------");
		//creating more than one variable inside of for loop
		for(int i = 1, ch = 65; i <= 26; i++, ch++){
			System.out.print(i + " " + (char) + ch);
		}

		System.out.println();
		System.out.println("-----------------------------------");
		//print alphas backwards
		for(int i = 26, ch = 90; i >= 1; i--, ch--){
			System.out.print(i + " " + (char) + ch);
		}

		System.out.println();
		System.out.println("-----------------------------------");
		//print upper and lowercase letters
		for (char i = 'A', j = 'a'; i <= 'Z'; i++, j++) {
			System.out.print(i + "" + j + " ");
		}

		System.out.println();
		System.out.println("-----------------------------------");
		//check if string is palindrome
		String word = "Python";
		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse += word.charAt(i);
		}
		boolean isPalindrome = word.equalsIgnoreCase(reverse);
		System.out.println(isPalindrome);

	}
}