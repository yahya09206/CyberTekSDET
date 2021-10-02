package day25_ForEach;

public class ReverseElement2 {
	public static void main(String[] args){

		String[] array = {"Java", "Python", "C#", "Cybertek", "School", "Selenium", "API"};

		for (String each : array) {
			String reverse = "";
			for (int i = each.length() - 1; i >= 0 ; i--) { // index numbers of the string
				reverse += each.charAt(i); // gets the characters from the string element
			}
			System.out.println(reverse);
		}
	}
}