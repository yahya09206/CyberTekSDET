package day23_Arrays;

public class MyClassmates {
	public static void main(String[] args){

		// If we know what the elements are
		String[] friends = {"Sabit", "Ahmet", "Tugba", "Beryl", "Ahmet"};
		System.out.println("Size: " + friends.length);

		// if we don't know what the elements are, but we know how many elements we want to store
		String[] friends2 = new String[5];
		System.out.println("Size: " + friends2.length);
		friends2[0] = "Sabit";
		friends2[1] = "Ahmet";
		friends2[2] = "Tugba";
		friends2[3] = "Beryl";
		friends2[4] = "Ahmet";
	}
}