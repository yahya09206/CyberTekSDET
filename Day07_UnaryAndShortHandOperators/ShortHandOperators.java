public class ShortHandOperators {
	public static void main(String[] args){
		String name1 = "Muhtar";
		String name2 = "Mehmet";
		String name3 = name2;

		name2 = name1;	
		name1 = name2;

		System.out.println("name1 = " + name1);
		System.out.println("name2 = " + name2);

		System.out.println("------------------------");
		int a = 200;
		System.out.println("a = " + a);
		int b = a;
		a = 100 + 300;
		System.out.println("a = " + a);

		System.out.println("------------------------");
		int balance = 300;
			//balance = balance + 200;
		balance += 200;

		System.out.println("Balance " + balance);

		balance += 1000;
		System.out.println("Balance = " + balance);

		String school = "Cybertek";
		school += " School";
		System.out.println("School = " + school);

		String name = "John";
		String lastName = "Daniel";
		name += " ";
		name += lastName;

		System.out.println("Name = " + name);

		System.out.println("------------------------");

		//withdraw
		balance -= 300;
		System.out.println("Balance = " + balance);

		balance -= 1000;
		System.out.println("Balance = " + balance);

		System.out.println("------------------------");
		//*=
		double salary = 100000;
		salary *= 2;
		System.out.println("Salary = $ " + salary);
		salary *= 1.5;
		System.out.println("Salary = $ " + salary);

		//tax 0.65
		salary *= 0.65;
		System.out.println("Salary = " + salary);

		System.out.println("------------------------");
		// /=
		//int slices = 10;
		double slices = 10; // 10.0
		//slices /= 5;
		slices /= 0;
		System.out.println("Slices = " + slices);
		//System.out.println(10/0);

		System.out.println("------------------------");
		// %=






















	}
}