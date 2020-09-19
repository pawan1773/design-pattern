package creational.factory;

public class ShapeFactory {

	public static Shape getShape(final String shapeType) {
		if ("Rectangle".equalsIgnoreCase(shapeType)) {
			return new Rectangle();
		} else if ("Circle".equalsIgnoreCase(shapeType)) {
			return new Circle();
		} else if ("Square".equalsIgnoreCase(shapeType)) {
			return new Square();
		} else {
			return null;
		}
	}
}
