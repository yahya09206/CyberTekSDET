public class Tesla {

	public static boolean isElectric = true;

	public Tesla(String model, int year, double price, String color, long miles){
		super("Tesla", model, year, price, color, miles);
	}

	public void autoPilot(){
		System.out.println(brand + " " + model + " is driving by itself");
	}
}