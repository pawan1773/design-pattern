package creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        final LazySingleton instance1 = LazySingleton.getInstance();
        final LazySingleton instance2 = LazySingleton.getInstance();

        /** check if both instances refer to same object */
        System.out.println("LazySingleton: " + (instance1 == instance2));

        /** try to break using reflection */
        try {
            final Constructor<LazySingleton> declaredConstructor = LazySingleton.class.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            try {
                final LazySingleton instance3 = declaredConstructor.newInstance();
                System.out.println(instance1 == instance3);
            } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
                    | InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }

        /** try to break using serialization/deserialization */
        final LazySingleton instance4 = LazySingleton.getInstance();
        final ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.ser"));
        oos.writeObject(instance4);
        oos.close();

        final ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.ser"));
        final LazySingleton instance5 = (LazySingleton) ois.readObject();
        ois.close();
        System.out.println("Post serialization/deserialization: " + (instance4 == instance5));

        /** try to break using clone */
        final LazySingleton instance6 = LazySingleton.getInstance();
        LazySingleton instance7;
        try {
            instance7 = (LazySingleton) instance6.clone();
            System.out.println(instance7);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        final ThreadSafeLazySingleton instance8 = ThreadSafeLazySingleton.getInstance();
        final ThreadSafeLazySingleton instance9 = ThreadSafeLazySingleton.getInstance();

        System.out.println("ThreadSafeLazySingleton: " + (instance8 == instance9));

        final SingletonEnum instance10 = SingletonEnum.INSTANCE;
        final SingletonEnum instance11 = SingletonEnum.INSTANCE;

        System.out.println("SingletonEnum: " + (instance10 == instance11));

        final EagerSingleton instance12 = EagerSingleton.getInstance();
        final EagerSingleton instance13 = EagerSingleton.getInstance();

        System.out.println("EagerSingleton: " + (instance12 == instance13));

        final BillPughSingleton instance14 = BillPughSingleton.getInstance();
        final BillPughSingleton instance15 = BillPughSingleton.getInstance();

        System.out.println("BillPughSingleton: " + (instance14 == instance15));
    }
}
