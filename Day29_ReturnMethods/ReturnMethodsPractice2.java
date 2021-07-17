import java.util.Arrays;
public class ReturnMethodsPractice2 {
	public static void main(String[] args){

		grade(95);

	}

	// public static void grade(int score){

	// 	if (score > 100 || score < 0) {
	// 		System.out.println("Invalid");
	// 		return; // can use return statement to exit method
	// 	}

	// 	if(score >= 90){
	// 		System.out.println("A");
	// 	}else if(score >= 80){
	// 		System.out.println("B");
	// 	}else if(score >= 70){
	// 		System.out.println("C");
	// 	}else if(score >= 60){
	// 		System.out.println("D");
	// 	}else {
	// 		System.out.println("F");
	// 	}
	// }

	//same grade method but with return value
	public static String grade(int score){
		String result = "";
		if(score >= 0 && score <=){
			result = (score >= 90) ? "A" : (score >= 80)? "B" :(score >= 70)? "C" : (score >= 60)? "D" : "F";
		}else {
			result = "Invalid";
		}
		return result;
	}
}