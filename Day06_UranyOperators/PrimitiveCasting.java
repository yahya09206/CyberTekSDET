public class PrimitiveCasting {
	public static void main(String[] args){
		byte a = 10;
		long b = a;
		System.out.println(a);

		double d = 10.0;
		int f = (int) d;

		System.out.println("-----------");
		long n = 100;
		//cast to same data type
		short m = (short) n;

		float q = 2.5f;
		int u = (int) q;

		short s = (short) q;

		System.out.println((double)2.5f);
		System.out.println((double)10L);

		int w = 129;
		byte z = (byte) w;
		System.out.println("z = " + z);

		int e = 70000;
		short g = (short) e;

		System.out.println("g = " + g);


	}
}