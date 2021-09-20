package utilities;

public class AccessModifiers_Inheritance extends Data2{

	// same package: public, protected, default all visible

	public void method(){
		System.out.println(publicVariable);
		System.out.println(protectedVariable);
		System.out.println(defaultVariable);

		publicMethod();
		protectedMethod();
		defaultMethod();
	}
}