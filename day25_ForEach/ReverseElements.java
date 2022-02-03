package day25_ForEach;

public class ReverseElements {
	public static void main(String[] args){
		String[] arr = {"Java", "Python", "C#"};

		for (String each : arr) {
			String reverse = "";
			for (int i = each.length() - 1; i >= 0; i--){
				reverse += each.charAt(i);
			}
			System.out.println(reverse);
		}
	}
}