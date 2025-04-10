package org.example;

public class SMSNotification extends Notification {

    public SMSNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void send(String recipient, String message) {
        System.out.printf("Sending to: %s", recipient);
        System.out.printf("SMS content: %s", message);
        System.out.println("Connecting to SMS gateway...");
        System.out.println("Sending SMS...");
    }

}