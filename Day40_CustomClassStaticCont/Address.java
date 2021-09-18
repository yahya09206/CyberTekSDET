public class Address {

	public String buildingNumber, street, city, state;
	public int zipCode;

	public static String country = "USA";
	public static String planetName = "Earth";

	public void setInfo(String buildingNumber, String street, String city, String state, int zipCode){
		this.buildingNumber = street;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String toString() {
        return buildingNumber+" "+street+"\n"+city+" "+state+", "+zipCode;
    }
}
	// can't access non static fields from static method
	// static belongs to the class, instance belongs to object
	// public void setInfo(){
	// 	System.out.println(country);
	// 	System.out.println(buildingNumber); // instance method accepts static and non-static
	// }

	// public static void sentInfo2(){
	// 	System.out.println(country);
	// 	System.out.println(buildingNumber);// static only accepts static members(class cannot share object members)
	// }