import java.util.Arrays;
public class Grades {
	public static void main(String[] args){

		String[] names = {"Anna", "Nancy", "Sarah"};
		int[] scores = {90, 75, 80};
		char[] grades = new char[names.length];

		for(int i = 0; i <= grades.length - 1; i++){
			// int[] scores = scores[0];
			if(scores[i] >= 90){
				grades[i] = 'A';
			}else if(scores[i] >= 80){
				grades[i] = 'B';
			}else if(scores[i] >= 70){
				grades[i] = 'C';
			}else if(scores[i] >= 60){
				grades[i] = 'D';
			}else {
				grades[i] = 'F';
			}
			System.out.println(names[i] + ": " + scores[i] + ": " + grades[i]);
		}
	}
}