package day16_StringContinued;

public class EmailDomain {
	public static void main(String[] args){

		String email = "Cybertek.School@gmail.com";

		int beginningIndex = email.indexOf("@") + 1;
		int endingIndex = email.lastIndexOf(".");
		String domain = email.substring(beginningIndex, endingIndex);
		System.out.println("domain = " + domain);

	}
}