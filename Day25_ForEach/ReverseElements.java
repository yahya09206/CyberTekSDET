import java.util.Arrays;
public class ReverseElements {
	public static void main(String[] args){

		String[] array = {"Java", "Python", "C#"};

		String element = array[0];
		String reverse = "";

		for (int i = element.length() - 1; i >= 0; i--) {
			reverse += element.charAt(i);// gets the characters from the string element
		}

		array[0] = reverse;
		System.out.println(Arrays.toString(array));
	}
}