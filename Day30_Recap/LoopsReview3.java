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
		System.out.println(sentence);

		System.out.println("---------------------------");
		for(int i = 0; i <= 5; i++){
			for(int j = 1; j <= 10; j++){
			System.out.print(j + " ");	
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("---------------------------");
		//find frequency of 1 character
		String str = "aabcccd";

		for(int j = 0; j <= str.length() - 1; j++){
			char ch = str.charAt(j);
			int frequency = 0;
			for (int i = 0; i <= str.length() - 1; i++) {//index num of str
				if(str.charAt(i) == ch){//
					frequency++;
				}
			}
			System.out.println(frequency);
		}
	}
}