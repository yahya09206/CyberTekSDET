import java.util.Arrays;
public class Grades {
	public static void main(String[] args){

		String[] names = {"Anna", "Nancy", "Sarah"};
		int[] scores = {90, 75, 80};
		char[] grades = new char[names.length];

		int score = scores[0];
		if(score >= 90){
			grades[0] = 'A';
		}else if(score >= 80){
			grades[0] = 'B';
		}else if(score >= 70){
			grades[0] = 'C';
		}else if(score >= 60){
			grades[0] = 'D';
		}else {
			grades[0] = 'F';
		}
	}
}