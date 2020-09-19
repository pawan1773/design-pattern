package creational.abstract_factory;

public class RoundShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(final String shapeType) {
		if ("CIRCLE".equalsIgnoreCase(shapeType)) {
			return new Circle();
		} else if ("ELLIPSE".equalsIgnoreCase(shapeType)) {
			return new Ellipse();
		}
		return null;
	}

}
