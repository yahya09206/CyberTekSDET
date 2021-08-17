public class Toyota extends Car{

	//don't need to put inside constructor because it is static
	boolean static boolean isReliable = true;

	public Toyota(String model, int year, double price, String color, long miles){
		super("Toyota", model, year, price, color, miles);
	}
}