public class DogPark {
	public static void main(String[] args){
		Dog dog1 = new Dog();
		dog1.name = "james";
		dog1.gender = "male";
		dog1.breed = "husky";
		dog1.size = "large";
		dog1.age = 45;
		dog1.color = "grey";

		System.out.println(dog1.name);
		System.out.println(dog1.gender);
		System.out.println(dog1.breed);
		System.out.println(dog1.size);
		System.out.println(dog1.age);
		System.out.println(dog1.color);
	}
}