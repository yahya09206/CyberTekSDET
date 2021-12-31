package day16_StringContinued;

public class WebName {
	public static void main(String[] args){

		String url = "www.amazon.com";
		String name = url.substring(4, 10);
		System.out.println("name = " + name);
	}
}