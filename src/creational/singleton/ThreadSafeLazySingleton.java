package creational.singleton;

/**
 * <p>
 * This is a thread safe lazily initialised singleton class.
 * </p>
 * 
 * @author pawan1773
 */
public class ThreadSafeLazySingleton {

    private static ThreadSafeLazySingleton INSTANCE;

    /**
     * <p>
     * Constructor is made private to avoid instance creation inside another class
     * using constructor. Null check is added to prevent instance creation using
     * reflection.
     * <p>
     */
    private ThreadSafeLazySingleton() {
        if (null != INSTANCE) {
            throw new InstantiationError("Instance creation not allowed");
        }
    }

    /**
     * <p>
     * To return instance of {@linkplain ThreadSafeLazySingleton} class.
     * </p>
     * 
     * @return instance of {@linkplain ThreadSafeLazySingleton}
     */
    public static ThreadSafeLazySingleton getInstance() {
        if (null == INSTANCE) {
            synchronized (ThreadSafeLazySingleton.class) {
                if (null == INSTANCE) {
                    INSTANCE = new ThreadSafeLazySingleton();
                }
            }
        }
        return INSTANCE;
    }
}
