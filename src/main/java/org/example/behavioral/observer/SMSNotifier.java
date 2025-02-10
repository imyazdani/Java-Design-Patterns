package org.example.behavioral.observer;

public class SMSNotifier implements Observer {
    private final String phoneNumber;

    public SMSNotifier(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String message) {
        System.out.println("SMS sent to " + phoneNumber + ": " + message);
    }
}
