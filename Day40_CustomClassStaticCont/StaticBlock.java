import java.util.ArrayList;
import java.util.Arrays;
public class StaticBlock {

	// not neccessary
	public static int a;

	// meant to init static variable
	// first thing in class to run no matter what
	public static ArrayList<String> list = new ArrayList<>();


	static {
		list.addAll(Arrays.asList("A", "B", "C"));
	}

	public static void main(String[] args){
		list.addAll(Arrays.asList("A", "B", "C"));
	}
}