package creational.abstract_factory;

public class FactoryProducer {

    public static AbstractFactory getFactory(final String choice) {
        AbstractFactory abstractFactory = null;
        if ("FLAT".equalsIgnoreCase(choice)) {
            abstractFactory = new FlatShapeFactory();
        } else if ("ROUND".equalsIgnoreCase(choice)) {
            abstractFactory = new RoundShapeFactory();
        }
        return abstractFactory;
    }
}
