package day27_Recap;

public class FirstUniqueCharacter {
	public static void main(String[] args){

		String str = "aaaabccddefggggh";
		int count = 0;

		//indexOf('a') ==> 0
		//lastIndexOf('a') ==> 2

		for(char each : str.toCharArray()){
			if (str.indexOf(each) == str.lastIndexOf(each)){
				count++;
				System.out.println(each);
			}
		}
	}
}