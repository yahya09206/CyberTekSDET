import java.util.Arrays;
public class WarmUpTask0 {
	public static void main(String[] args){

		int[] numbers {100,200,300,400,500,600};
		remove(numbers, 3);
	}

	//method to remove element at given index of the array
	public static int[] remove(int[] array, int index){
		if(index < 0 || index > array.length - 1){//if the given index number is invalid
			System.err.println("Invalid index");
			return array;

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
}