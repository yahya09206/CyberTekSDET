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
		//loop thru whole string
		for(int j = 0; j <= str.length() - 1; j++){
			//assign ch to each index @ j
			char ch = str.charAt(j);
			//coutner
			int frequency = 0;
			for (int i = 0; i <= str.length() - 1; i++) {//index num of str
				if(str.charAt(i) == ch){//check if index is equal to char from before then add to frequency
					frequency++;
				}
			}
			//System.out.println(ch + "-" + frequency);
			//if only seen once, print out
			if(frequency == 1){
				System.out.println(ch);
			}
		}
	}
}