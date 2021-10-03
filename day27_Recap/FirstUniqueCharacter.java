package day27_Recap;

public class FirstUniqueCharacter {
	public static void main(String[] args){

		String str = "aaa bccddefggggh";

		for (char each : str.replace(" ", "").toCharArray()){ // represents each character of str excluding space
			if (str.indexOf(each) == str.lastIndexOf(each)){ // check if current index matches last index of each
				System.out.println(each);
			}
		}
	}
}