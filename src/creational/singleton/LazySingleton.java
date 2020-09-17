package creational.singleton;

import java.io.Serializable;

/**
 * <p>
 * This is a lazily initialised singleton class.
 * </p>
 * 
 * @author pawan1773
 */
public class LazySingleton implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    private static LazySingleton INSTANCE;

    /**
     * <p>
     * Constructor is made private to avoid instance creation inside another class
     * using constructor. Null check is added to prevent instance creation using
     * reflection.
     * <p>
     */
    private LazySingleton() {
        if (null != INSTANCE) {
            throw new InstantiationError("Instance creation not allowed");
        }
    }

    /**
     * <p>
     * To return instance of {@linkplain LazySingleton} class.
     * </p>
     * 
     * @return instance of {@linkplain LazySingleton}
     */
    public static LazySingleton getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

    /**
     * <p>
     * To prevent new object creation during serialization.
     * </p>
     * 
     * @return instance of {@linkplain LazySingleton}
     */
    protected Object readResolve() {
        return INSTANCE;
    }

    /**
     * <p>
     * To prevent cloning.
     * </p>
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
