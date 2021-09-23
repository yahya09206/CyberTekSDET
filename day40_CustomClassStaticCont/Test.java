package day40_CustomClassStaticCont;

public class Test {
	public static void main(String[] args){

		System.out.println(StaticBlock.list);
		StaticBlock.list.set(0, "Z");

		System.out.println(StaticBlock.list);
		System.out.println("-----------------------------------");

		ExecutionOfStaticBlock.method1();
	}
}