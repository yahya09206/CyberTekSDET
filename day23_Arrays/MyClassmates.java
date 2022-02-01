package day23_Arrays;

public class MyClassmates {
	public static void main(String[] args){

		String[] friends = new String[5];
		friends[0] = "Sabit";
		friends[1] = "Mussai";
		friends[2] = "Shazia";
		friends[3] = "Ahmet";
		friends[4] = "Beryl";

		for (int i = 0; i <= friends.length - 1; i++){
			System.out.print(friends[i] + " ");
		}
	}
}