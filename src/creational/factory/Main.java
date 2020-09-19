package creational.factory;

public class Main {

	public static void main(String[] args) {
		final Shape rectangle = ShapeFactory.getShape("Rectangle");
		rectangle.draw();

		final Shape circle = ShapeFactory.getShape("Circle");
		circle.draw();

		final Shape square = ShapeFactory.getShape("Square");
		square.draw();
	}

}
