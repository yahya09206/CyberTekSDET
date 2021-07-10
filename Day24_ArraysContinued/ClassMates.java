import java.util.*;

public class ClassMates {
	public static void main(String[] args){

		String[] classmates = {"Gulistan", "Fruza", "Memet", "Muhtar", "Tamara", "Abbos", "Shirin", "Robinson", "Shirin"};

		System.out.println(Arrays.toString(classmates));

		for(int i = 0; i <= classmates.length - 1; i++){
			System.out.println(classmates[i].substring(0,3));
		}

	}
}