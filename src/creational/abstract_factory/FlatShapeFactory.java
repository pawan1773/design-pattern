package creational.abstract_factory;

public class FlatShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(final String shapeType) {
        Shape shape = null;
        if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
            shape = new Rectangle();
        } else if ("SQUARE".equalsIgnoreCase(shapeType)) {
            shape = new Square();
        }
        return shape;
    }
}
