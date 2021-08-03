class CybertekStudent {
	public String name, gender;
	public int age, ID;

	public String schoolName;
}

public class StaticExample {
	public static void main(String[] args){
		CybertekStudent student1 = new CybertekStudent();
		student1.schoolName = "Cybertek School";
		System.out.println(student1.schoolName);
		
		CybertekStudent student2 = new CybertekStudent();
	}
}