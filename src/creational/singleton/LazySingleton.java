package creational.singleton;

/**
 * <p>
 * This is a basic lazily initialised singleton class.
 * </p>
 * 
 * @author pawan1773
 *
 */
public class LazySingleton {

    private static LazySingleton INSTANCE;

    /**
     * <p>
     * Constructor is made private to avoid instance creation using construction.
     * Null check is added to prevent instance using reflection.
     * <p>
     */
    private LazySingleton() {
        if (null != INSTANCE) {
            throw new InstantiationError("Instance creation not allowed");
        }
    }

    /**
     * <p>
     * 
     * @return instance of {@linkplain LazySingleton}
     */
    public static LazySingleton getInstance() {
        
        if (null == INSTANCE) {
            INSTANCE = new LazySingleton();
        }

        return INSTANCE;
    }
}
