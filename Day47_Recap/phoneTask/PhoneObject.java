public class PhoneObject {
	public static void main(String[] args) {
		
		Iphone iphone = new Iphone("12", "large", "Black", 1100);
		iphone.call(911);
		iphone.call(123443,223343,223343);
		iphone.text(232424323);
		iphone.faceTime(23232323);
		
		Samsung samsung = new Samsung("galaxy s6", "extra large", "white", 1000);


	}
}