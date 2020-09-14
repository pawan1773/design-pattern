package creational.singleton;

public class Main {

    public static void main(String[] args) {
        final LazySingleton instance1 = LazySingleton.getInstance();
        final LazySingleton instance2 = LazySingleton.getInstance();

        System.out.println(instance1 == instance2);
    }

}
