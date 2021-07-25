import java.util.Arrays;
public class WarmupTask0 {
	public static void main(String[] args){

		int[] numbers = {100,200,300,400,500,600};
		System.out.println(Arrays.toString(numbers));
		numbers = remove(numbers, 2);
		System.out.println(Arrays.toString(numbers));
		System.out.println("------------------------------------");
		double[] array1 = {6.5,7.5,8.5,9.5};
		array1 = remove(array1, 2);
		System.out.println(Arrays.toString(array1));
		System.out.println("------------------------------------");
		String[] students = {"Dilem", "Aysu", "Mucahit", "Tugba", "Fhilipp"};
		students = remove(students, 3);
		System.out.println(Arrays.toString(students));

	}

	//method to remove element of int at given index of the array
	public static int[] remove(int[] array, int index){
		if(index < 0 || index > array.length - 1){//if the given index number is invalid
			System.err.println("Invalid index");
			System.exit(0);

		}
		//new array with size of original length minus 1
		int[] result = new int[array.length-1];
		//loop to iterate all indexes
		for (int i = 0, j = 0; i < array.length; i++) {
			if (i == index) {//moves all elements of array except the element at given index
				continue;
			}else {
				result[j++] = array[i];
			}
		}
		return result;
	}

	//method to remove element of double at given index of the array
	public static double[] remove(double[] array, int index){
		if(index < 0 || index > array.length - 1){//if the given index number is invalid
			System.err.println("Invalid index");
			System.exit(0);

		}
		//new array with size of original length minus 1
		double[] result = new double[array.length-1];
		//loop to iterate all indexes
		for (int i = 0, j = 0; i < array.length; i++) {
			if (i == index) {//moves all elements of array except the element at given index
				continue;
			}else {
				result[j++] = array[i];
			}
		}
		return result;
	}

	//method to remove element of double at given index of the array
	public static String[] remove(String[] array, int index){
		if(index < 0 || index > array.length - 1){//if the given index number is invalid
			System.err.println("Invalid index");
			System.exit(0);

		}
		//new array with size of original length minus 1
		String[] result = new String[array.length-1];
		//loop to iterate all indexes
		for (int i = 0, j = 0; i < array.length; i++) {
			if (i == index) {//moves all elements of array except the element at given index
				continue;
			}else {
				result[j++] = array[i];
			}
		}
		return result;
	}
}