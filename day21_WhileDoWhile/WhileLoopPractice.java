public class WhileLoopPractice {
	public static void main(String[] args){

		String sentence = "Java Java Java Java";
		String originalSentence = sentence; // to keep original sentence
		int countJava = 0;

		// if statement only does once
		while(sentence.contains("Java")){
			countJava++;
			sentence = sentence.replaceFirst("Java", " "); 
		}

		System.out.println("countJava = " + countJava);
	}
}