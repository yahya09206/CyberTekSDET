public class {
	public double radius;
	public double diameter;
	// public double PI = 3.14;

	public void setInfo(double radius){
		this.radius = radius;
		diameter = 2 * radius;
	}

	public double area(){
		return radius * radius * Math.PI;
	}
}