package creational.abstract_factory;

public class Main {

	public static void main(String[] args) {
		final AbstractFactory flatShapeFactory = FactoryProducer.getFactory("FLAT");
		final Shape rectangle = flatShapeFactory.getShape("RECTANGLE");
		rectangle.draw();

		final AbstractFactory roundShapeFactory = FactoryProducer.getFactory("ROUND");
		final Shape circle = roundShapeFactory.getShape("CIRCLE");
		circle.draw();
	}

}
