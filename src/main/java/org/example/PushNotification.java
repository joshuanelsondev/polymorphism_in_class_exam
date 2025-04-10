package org.example;

import java.util.Arrays;

public class PushNotification extends Notification {
    public String deviceInfo;

    public PushNotification(String recipient, String message, String deviceInfo) {
        super(recipient, message);
        this.deviceInfo = deviceInfo;
    }

    @Override
    public void send(String recipient, String message) {
        System.out.printf("Sending to: %s", recipient);
        System.out.printf("Push notification content: %s", message);
        System.out.println("Connecting to push notification service...");
        System.out.println("Sending push notification...");
    }
}
