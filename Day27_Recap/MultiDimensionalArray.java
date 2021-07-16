import java.util.Arrays;
public class MultiDimensionalArray {
	public static void main(String[] args){
		String[] scrum1 = {"Komiljon", "Yuliang"};
		String[] scrum2 = {"Sabir", "Tamara"};
		String[] scrum3 = {"Tugba", "Hilal", "Dilem"};

		//2 dimensional array has to contain 1 dimensional array
		String[][] scrumTeams = {scrum1, scrum2, scrum3};

		//Print out 2d array using toDeepString
		System.out.println(Arrays.deepToString(scrumTeams));
	}
}