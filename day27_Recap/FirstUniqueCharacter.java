package day27_Recap;

public class FirstUniqueCharacter {
	public static void main(String[] args){

		String str = "aaa bccddefggggh";

		for (char each : str.replace(" ", "").toCharArray()){ // represents each character of str excluding space
			if (str.indexOf(each) == str.lastIndexOf(each)){
				System.out.println(each);
			}
		}
	}
}