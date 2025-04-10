package org.example;

public class PushNotification extends Notification {

    public PushNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void send(String recipient, String message) {
        System.out.printf("Sending to: %s", recipient);
        System.out.printf("Push notification content: %s", message);
        System.out.println("Connecting to push notification service...");
        System.out.println("Sending push notification...");
    }
}
