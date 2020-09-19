package creational.abstract_factory;

public class FlatShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(final String shapeType) {
		if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
			return new Rectangle();
		} else if ("SQUARE".equalsIgnoreCase(shapeType)) {
			return new Square();
		}
		return null;
	}

}
