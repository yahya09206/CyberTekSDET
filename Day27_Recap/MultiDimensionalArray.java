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
		System.out.println(Arrays.toString(scrumTeams[0]));
		System.out.println(scrumTeams[1][1]);

		System.out.println("-------------------------------------");
		//print out each individual element from 2d array
		for (String[] eachScrum : scrumTeams) {
			System.out.println(Arrays.toString(eachScrum));
		}

		System.out.println("-------------------------------------");
		//
		for (String[] eachScrum : scrumTeams) {
			for (String eachMember : eachScrum) {
				System.out.print(eachMember + " ");
			}
		}
	}
}