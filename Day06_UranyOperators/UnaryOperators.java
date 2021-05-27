public class UnaryOperators {
	public static void main(String[] args){
		int a = 100;
		++a;
		System.out.println("a = " + a);

		int b = 100;
		--b;
		System.out.println("a = " + b);

		System.out.println("----------------------");

		int x = 10;
		//System.out.println(++x); // pre-incrememnt will increase value right away
		System.out.println(x++); // post-increment will pass current value then increase
		System.out.println("x = " + x);
	}
}