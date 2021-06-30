public class StringPractice {
	public static void main(String[] args){

		String gmail = "Cybertek@gmail.com";
		String domain = gmail.substring(gmail.indexOf("@"));
		boolean isValidGmail = domain.equals("@gmail.com");

		System.out.println("isValidGmail = " + isValidGmail);
	}
}