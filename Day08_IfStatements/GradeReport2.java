public class GradeReport2 {
	public static void main(String[] args){
		int score = 95;
		boolean madeA = score >= 90 && score <= 100;
		boolean madeB = !madeA && score >= 80;
		boolean madeC = !madeA && !madeB && >= 70;
		boolean madeD = !madeA && !madeB && !madeC && >= 60;
		boolean madeF = !madeA && !madeB && !madeC && !madeD && < 60;
	}
}