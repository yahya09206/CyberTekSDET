public class CybertekStudent {

	public String name;
	public int age;
	public char gender;

	public static String schoolName, fieldOfStudy, programmingLanguage;

	public CybertekStudent(String name, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	static {
		schoolName = "Cybertek School";
		fieldOfStudy = "IT";
		programmingLanguage = "Java";
	}

	
}