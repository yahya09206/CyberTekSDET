public class LoopsReview3 {
	public static void main(String[] args){
		String sentence = "I love Java, Java is fun, Java Java Java";
		String word = "Java";
		int count = 0;
		while(sentence.contains(word)){
			sentence = sentence.replaceFirst("Java", "");
			count++;
		}
		System.out.println(count);

	}
}