package creational.singleton;

/**
 * <p>
 * This is called Bill Pugh singleton class.
 * </p>
 * 
 * @author pawan1773
 */
public class BillPughSingleton {

    private BillPughSingleton() {

    }

    static class BillPughHelper {
        private static BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return BillPughHelper.INSTANCE;
    }
}
