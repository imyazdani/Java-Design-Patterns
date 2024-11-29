package org.example.creational.singleton;

/*
    Singleton is a creational design pattern, which ensures that only one object of its kind exists
    and provides a single point of access to it for any other code.
 */
public class Singleton {
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
