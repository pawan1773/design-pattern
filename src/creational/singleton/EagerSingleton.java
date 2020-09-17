package creational.singleton;

/**
 * <p>
 * This is a eagerly initialised singleton class.
 * </p>
 * 
 * @author pawan1773
 */
public class EagerSingleton {

    private static EagerSingleton INSTANCE;

    private EagerSingleton() {
    }

    static {
        INSTANCE = new EagerSingleton();
    }

    /**
     * <p>
     * To return instance of {@linkplain EagerSingleton} class.
     * </p>
     * 
     * @return instance of {@linkplain EagerSingleton}
     */
    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
