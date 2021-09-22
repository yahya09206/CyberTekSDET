public class Circle extends Shape{

	private double r;
	public final static double PI = 3.14;

	public double getR(){
		return r;
	}

	public void setR(double r){
		this.r = r;
	}

	public Circle(double r){
		super("Circle");
		this.r = r;
	}

	@Override
	public double area(){
		return r * r * PI;
	}

	@Override
	public double perimeter(){
		return 2 * r * PI;
	}
}