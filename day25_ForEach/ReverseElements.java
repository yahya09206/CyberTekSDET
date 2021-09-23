import java.util.Arrays;
public class ReverseElements {
	public static void main(String[] args){

		String[] array = {"Java", "Python", "C#"};

		//Loop to go through all elements of array
		for(int j = 0; j < array.length; j++){
			//Start at j
			String element = array[j];
			// empty string
			String reverse = "";
			//loop to reverse each element in array
			for (int i = element.length() - 1; i >= 0; i--) {
				reverse += element.charAt(i);// gets the characters from the string element
			}
			//assigned reversed element to the index of the array
			array[j] = reverse;
		}
		System.out.println(Arrays.toString(array));
	}
}