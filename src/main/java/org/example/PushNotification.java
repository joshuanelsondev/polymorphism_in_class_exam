package org.example;

public class PushNotification extends Notification {

    public PushNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending to: device123");
        System.out.println("Push notification content: Test Push");
        System.out.println("Connecting to push notification service...");
        System.out.println("Sending push notification...");
    }
}
