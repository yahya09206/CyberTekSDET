package day24_ArraysContinued;

public class Grades {
	public static void main(String[] args){

		String [] names = {"Anna", "Nancy", "Sarah", "Abbos", "Yuliang", "Raphael", "Tamerlan", "Muhtar", "Jack"};
		int [] scores = {90, 75, 80, 85, 91, 92, 93, 45, 65};
		char[] grades = new char[names.length]; //{A, C, B}
		int countA = 0;
		int countB = 0;
		int countC = 0;
		int countD = 0;
		int countF = 0;

		for (int i = 0; i <= grades.length - 1; i++) {

			int score = scores[i];
			if (score >= 90){
				grades[i] = 'A';
			}else if(score >= 80){
				grades[i] = 'B';
			}else if (score >= 70){
				grades[i] = 'C';
			}else if (score >= 60){
				grades[i] = 'D';
			}else {
				grades[i] = 'F';
			}
		}

	}
}