package day25_ForEach;

public class UniqueElements {
	public static void main(String[] args){

		String[] words = {"java", "java", "python", "c#"};

		int count = 0;

		for (String element : words) {
			if (element.equals("java")){
				count++;
			}
		}

		if (count == 1){
			System.out.println("java");
		}
	}
}