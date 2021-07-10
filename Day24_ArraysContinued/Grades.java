import java.util.Arrays;
public class Grades {
	public static void main(String[] args){

		String[] names = {"Anna", "Nancy", "Sarah", "Mike", "Jacob", "Will", "Michelle"};
		int[] scores = {90, 75, 80, 85, 91, 92, 93};
		char[] grades = new char[names.length];
		int countA = 0;
		int countB = 0;
		int countC = 0;
		int countD = 0;
		int countF = 0;

		for(int i = 0; i <= grades.length - 1; i++){
			// int[] scores = scores[0];
			if(scores[i] >= 90){
				grades[i] = 'A';
				countA++;
			}else if(scores[i] >= 80){
				grades[i] = 'B';
				countB++;
			}else if(scores[i] >= 70){
				grades[i] = 'C';
				countC++;
			}else if(scores[i] >= 60){
				grades[i] = 'D';
				countD++;
			}else {
				grades[i] = 'F';
				countF++;
			}
		//Using ternary operator
		// grades[i] = (scores[i] >= 90)? 'A' :(scores[i] >= 80)? 'B' :(scores[i] >= 70)? 'C' :(scores[i] >= 60)? 'D' :'F';
		System.out.println(names[i] + ": " + scores[i] + ": " + grades[i]);
		System.out.println("CountA = " + countA);
		System.out.println("CountB = " + countB);
		System.out.println("CountC = " + countC);
		System.out.println("CountD = " + countD);
		System.out.println("CountF = " + countF);
		}

	}
}