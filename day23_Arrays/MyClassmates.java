package day23_Arrays;

public class MyClassmates {
	public static void main(String[] args){

		String[] classMates = new String[5];
		System.out.println("Size:" + classMates.length);

		classMates[0] = "Jimmy";

		for (int i = 0; i <= classMates.length - 1; i++) {
			System.out.println(classMates[i]);
		}
	}
}