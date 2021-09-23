public class GradeReport {
	public static void main(String[] args){
		int score = 85;

		if(score >= 90 && score <= 100){
			System.out.println("You made an A.");
		}
		if(score >= 80 && score < 90){
			System.out.println("You made a B.");
		}
		if(score >= 70 && score < 80){
			System.out.println("You made a C.");
		}
		if(score >= 60 && score < 70){
			System.out.println("You made a D.");
		}
		if(score < 60){
			System.out.println("You are a failure.");
		}
	}
}