public class Birthday {
	public static void main(String[] args){
		String name = "John",
				birthMonth = "May";
		int birthDay = 15;
		int birthYear = 1993;

		System.out.println(name + " was born on " + birthMonth + "/" + birthDay + "/" + birthYear);

		int age = 2021 - birthYear;
		System.out.println(name + " is " + age);
	}
}