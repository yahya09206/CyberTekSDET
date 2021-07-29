public class DogPark {
	public static void main(String[] args){
		Dog dog1 	= new Dog();
		dog1.name 	= "james";
		dog1.gender = "male";
		dog1.breed 	= "husky";
		dog1.size 	= "large";
		dog1.age 	= 45;
		dog1.color 	= "grey";

		System.out.println(dog1.name);
		System.out.println(dog1.gender);
		System.out.println(dog1.breed);
		System.out.println(dog1.size);
		System.out.println(dog1.age);
		System.out.println(dog1.color);

		//Second dog object
		Dog dog2 = new Dog();
		dog2.setInfo("mikey", "male", 15, "small", "labradoodle", "white");
		System.out.println(dog2.name);
		System.out.println(dog2.gender);
		System.out.println(dog2.breed);
		System.out.println(dog2.size);
		System.out.println(dog2.age);
		System.out.println(dog2.color);

	}
}