public class BrowserObject {
	public static void main(String[] args) {
		
		Chrome chrome = new Chrome();
		chrome.open();

		System.out.println("-------------------------------------");

		Firefox firefox = new Firefox();
		firefox.open();
		firefox.close();
		firefox.backward();

		System.out.println("-------------------------------------");

		Opera opera = new Opera();
		opera.open();
		opera.close();

		System.out.println("-------------------------------------");

		Edge edge = new Edge();
        edge.open();
        edge.close();

        System.out.println("-------------------------------------");

        Safari safari = new Safari();
        safari.open();
        safari.close();
	}
}