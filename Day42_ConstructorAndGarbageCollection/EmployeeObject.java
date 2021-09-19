public class EmployeeObject {
	public static void main(String[] args){

		Employee employee1 = new Employee("Johnny");
		System.out.println(employee1);

		Employee employee2 = new Employee("Johnny", "SDET");
		System.out.println(employee2);

		Employee employee3 = new Employee("Johnny", "SDET", 2344);
		System.out.println(employee3);

		Employee employee4 = new Employee("Johnny", "QA", 45332, 220000);
		System.out.println(employee4);
	}
}