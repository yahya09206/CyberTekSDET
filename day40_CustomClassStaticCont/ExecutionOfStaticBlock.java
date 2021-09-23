package day40_CustomClassStaticCont;

public class ExecutionOfStaticBlock {

	// will always be first to run, doesn't matter placement
	static {
		System.out.println("Static Block");
	}

	public static void method1(){
		System.out.println("Method 1");
	}

	public static void main(String[] args){
		System.out.println("Main Method");
	}
}