public class BrowserObject {
	public static void main(String[] args) {
		
		Chrome chrome = new Chrome();
		chrome.open();

		Firefox firefox = new Firefox();
		firefox.open();
	}
}