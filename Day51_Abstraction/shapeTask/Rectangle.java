public class Rectangle extends Shape{

	private double l, w;

	public double getL(){
		return l;
	}

	public void setL(double l){
		if (l <= 0) {
			throw new RuntimeException("Invalid length: " + l);
		}
		this.l = l;
	}

	public double getW(){
		return l;
	}

	public void setW(double w){
		if (w <= 0) {
			throw new RuntimeException("Invalid length: " + w);
		}
		this.w = w;
	}

	public Rectangle(double l, double w){
		super("Rectangle");
		setL(l);
		setW(w);
	}

	@Override
	public double area(){
		return l * w;
	}

	@Override
	public double perimeter(){
		return (l + w) * 2;
	}

}