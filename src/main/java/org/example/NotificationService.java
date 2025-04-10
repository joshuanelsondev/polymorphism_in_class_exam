package org.example;

public class NotificationService {

    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        Notification email = new EmailNotification("user@example.com", "Hello there!");
        Notification sms = new SMSNotification("+15551234567", "Meeting reminder.");
        Notification push = new PushNotification("mobile_device_123", "New message!", "abc123def456");

        service.sendNotification(email);
        System.out.println("---");
        service.sendNotification(sms);
        System.out.println("---");
        service.sendNotification(push);
    }

    public void sendNotification(Notification notification) {
    }
}
