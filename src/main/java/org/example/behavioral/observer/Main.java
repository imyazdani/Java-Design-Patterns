package org.example.behavioral.observer;

/*
    The Observer pattern is a behavioral design pattern in Java used to implement a one-to-many dependency
    between objects. When one object (the subject) changes state, all its dependent objects (observers) are
    notified automatically.
 */
public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        Observer user1 = new EmailSubscriber("Alice");
        Observer user2 = new SMSNotifier("+123456789");

        notificationService.addObserver(user1);
        notificationService.addObserver(user2);

        // Send a notification
        notificationService.notifyObservers("New product launched!");

        // Remove an observer
        notificationService.removeObserver(user2);

        // Send another notification
        notificationService.notifyObservers("Limited-time discount available!");
    }
}
