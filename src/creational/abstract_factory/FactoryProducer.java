package creational.abstract_factory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {
		if ("FLAT".equalsIgnoreCase(choice)) {
			return new FlatShapeFactory();
		} else if ("ROUND".equalsIgnoreCase(choice)) {
			return new RoundShapeFactory();
		}
		return null;
	}

}
