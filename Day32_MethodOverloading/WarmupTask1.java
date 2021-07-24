public class WarmUpTask1 {
	public static void main(String[] args){
		
		int sum1 = sumOf2Numbers(10, 12);
		int sum2 = sumof3Numbers(100, 200, 300);
		int sum3 = sumof4Numbers(1000, 2000, 3000, 4000);
	}
	public static int sumOf2Numbers(int a, int b){
		return a + b;

	}

	public static int sumof3Numbers(int a, int b, int c){
		return a + b + c;
	}

	public static int sumof4Numbers(int a, int b, int c, int d){
		return a + b + c + d;
	}

	//--------------------Method overloading-------------------------
	public static int sum(int a, int b){ return a + b};

	public static int sum(int a, int b, int c){return a + b + c};

}