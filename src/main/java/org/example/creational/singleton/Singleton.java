package org.example.creational.singleton;

/*
    Singleton is a creational design pattern, which ensures that only one object of its kind exists
    and provides a single point of access to it for any other code.
    This singleton class is Thread-Safe.
 */
public class Singleton {
    private static volatile Singleton instance;

    private final String value;

    private Singleton(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Singleton getInstance(String value) {
        if (instance != null) {
            return instance;
        }

        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            System.out.println("An instance is created with value: " + value);
            return instance;
        }
    }
}
