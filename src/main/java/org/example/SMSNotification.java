package org.example;

public class SMSNotification extends Notification {

    public SMSNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending to: +1234567890");
        System.out.println("SMS content: Test SMS");
        System.out.println("Connecting to SMS gateway...");
        System.out.println("Sending SMS...");
    }

}