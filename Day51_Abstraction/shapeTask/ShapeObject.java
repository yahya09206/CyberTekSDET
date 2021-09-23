package Day51_Abstraction.shapeTask;

public class ShapeObject {
	public static void main(String[] args) {
		
		Circle circle = new Circle(3);
		Square square = new Square(5);
		Rectangle rectangle = new Rectangle(6, 4);

		System.out.println(circle);
		System.out.println(square);
		System.out.println(rectangle);
		
	}
}