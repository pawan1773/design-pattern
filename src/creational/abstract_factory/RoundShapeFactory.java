package creational.abstract_factory;

public class RoundShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(final String shapeType) {
        Shape shape = null;
        if ("CIRCLE".equalsIgnoreCase(shapeType)) {
            shape = new Circle();
        } else if ("ELLIPSE".equalsIgnoreCase(shapeType)) {
            shape = new Ellipse();
        }
        return shape;
    }
}
