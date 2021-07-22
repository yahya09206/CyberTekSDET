public class WarmUpTasks2 {
	public static void main(String[] args){

		String sentence = "Java Java JaVA";
		String word = "java";

		int count = 0;
		sentence = sentence.toLowerCase();
		word = word.toLowerCase();
		if (sentence.contains(word)) {
			sentence = sentence.replace(word, "");
			count++;
		}
		System.out.println(count);
	}
}