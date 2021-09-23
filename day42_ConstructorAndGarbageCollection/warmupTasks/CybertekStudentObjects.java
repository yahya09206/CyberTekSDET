package warmupTasks;

public class CybertekStudentObjects {
	public static void main(String[] args){

		CybertekStudent student1 = new CybertekStudent("John", 29, 'M');
		CybertekStudent student2 = new CybertekStudent("Feruza", 20, 'F');

		System.out.println(student1);
		System.out.println(student2);

		student1.attendClass();
		student2.replit();

		student1.askForBreak();
	}
}