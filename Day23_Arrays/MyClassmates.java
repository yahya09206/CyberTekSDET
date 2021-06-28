import java.util.Scanner;
public class MyClassmates {
	public static void main(String[] args){

		// If we know what the elements are
		String[] friends = {"Sabit", "Ahmet", "Tugba", "Beryl", "Ahmet"};
		System.out.println("Size: " + friends.length);

		for(int i = 0; i <= friends.length - 1; i++){
			System.out.println(friends[i] + " ");
		}


		System.out.println("--------------------------------------");
		// If we don't know what the elements are that we want to store
		String[] friends2 = new String[5];
		System.out.println("Size: " + friends2.length);

		for(int i = 0; i <= friends2.length - 1; i++){
			System.out.println(friends2[i]);
		}
	}
}