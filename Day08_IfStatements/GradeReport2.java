public class GradeReport2 {
	public static void main(String[] args){
		int score = 95;
		boolean madeA = score >= 90 && score <= 100;
		boolean madeB = !madeA && score >= 80;
		boolean madeC = !madeA && !madeB && score>= 70;
		boolean madeD = !madeA && !madeB && !madeC && score >= 60;
		boolean madeF = !madeA && !madeB && !madeC && !madeD && score < 60;

		if(madeA){
			System.out.println("Excellent, You made an A");
		}
		if(madeB){
			System.out.println("Good job, You made a B");
		}
		if(madeC){
			System.out.println("Good, you made a C");
		}
		if(madeD){
			System.out.println("You made a D");
		}
		if(madeF){
			System.out.println("You are a failure");
		}
	}
}