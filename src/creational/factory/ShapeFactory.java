package creational.factory;

public class ShapeFactory {

    public static Shape getShape(final String shapeType) {
        Shape shape = null;
        if ("Rectangle".equalsIgnoreCase(shapeType)) {
            shape = new Rectangle();
        } else if ("Circle".equalsIgnoreCase(shapeType)) {
            shape = new Circle();
        } else if ("Square".equalsIgnoreCase(shapeType)) {
            shape = new Square();
        }
        return shape;
    }
}
