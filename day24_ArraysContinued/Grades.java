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

		int score = scores[0];
		if (score >= 90){
			grades[0] = 'A';
		}else if(score >= 80){
			grades[0] = 'B';
		}else if (score >= 70){
			grades[0] = 'C';
		}else if (score >= 60){
			grades[0] = 'D';
		}else {
			grades[0] = 'F';
		}

	}
}