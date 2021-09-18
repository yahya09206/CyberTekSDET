public class Developer {

	public String name;
	public static char gender;
	public String jobTitle;
	public int id;
	public static double salary;

	public static boolean isEmployed;
	public static boolean hatesTester;

	static {
		isEmployed = true;
		hatesTester = true;
	}

	public Developer(String name, char gender, String jobTitle, int id, double salary){
		this.name = name;
		this.gender = gender;
		this.jobTitle = jobTitle;
		this.id = id;
		this.salary = salary;
	}
}