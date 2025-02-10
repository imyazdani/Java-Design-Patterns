package org.example.behavioral.observer;

public class EmailSubscriber implements Observer {
    private String name;

    public EmailSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received email update: " + message);
    }
}