package day16_StringContinued;

public class WebName {
	public static void main(String[] args){

		String url = "www.amazon.com";
		String name = url.substring(4, 10);
		String name2 = url.substring(url.indexOf(".") + 1, url.lastIndexOf("."));
		String domain = url.substring(url.lastIndexOf(".") + 1);
		System.out.println("name = " + name);
		System.out.println("name2 = " + name2);
		System.out.println("domain = " + domain);
	}
}