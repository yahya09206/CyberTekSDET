public class LoopsReview3 {
	public static void main(String[] args){
		String sentence = "I love Java, Java is fun";
		String word = "Java";
		int count = 0;
		while(sentence.contains("Java")){
			sentence.replaceFirst("Java", "");
			count++;
		}


	}
}