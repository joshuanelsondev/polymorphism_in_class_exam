package org.example;
import org.example.EmailNotification;
import org.example.Notification;
import org.example.NotificationService;
import org.example.PushNotification;
import org.example.SMSNotification;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class NotificationServiceTest {

    // Helper method to capture console output
    private String captureOutput(Runnable runnable) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        runnable.run();
        return outContent.toString().trim();
    }

    @Test
    public void testSendEmailNotification() {
        NotificationService service = new NotificationService();
        Notification emailNotification = new EmailNotification("test@example.com", "Test Email");
        String output = captureOutput(() -> service.sendNotification(emailNotification));

        assertTrue(output.contains("Sending to: test@example.com"));
        assertTrue(output.contains("Email content: Test Email"));
        assertTrue(output.contains("Connecting to SMTP server..."));
        assertTrue(output.contains("Sending email..."));
    }

    @Test
    public void testSendSMSNotification() {
        NotificationService service = new NotificationService();
        Notification smsNotification = new SMSNotification("+1234567890", "Test SMS");
        String output = captureOutput(() -> service.sendNotification(smsNotification));

        assertTrue(output.contains("Sending to: +1234567890"));
        assertTrue(output.contains("SMS content: Test SMS"));
        assertTrue(output.contains("Connecting to SMS gateway..."));
        assertTrue(output.contains("Sending SMS..."));
    }

    @Test
    public void testSendPushNotification() {
        NotificationService service = new NotificationService();
        Notification pushNotification = new PushNotification("device123", "Test Push", "token456");
        String output = captureOutput(() -> service.sendNotification(pushNotification));

        assertTrue(output.contains("Sending to: device123"));
        assertTrue(output.contains("Push notification content: Test Push"));
        assertTrue(output.contains("Connecting to push notification service..."));
        assertTrue(output.contains("Sending push notification..."));
    }

    @Test
    public void testPolymorphism() {
        NotificationService service = new NotificationService();
        Notification[] notifications = new Notification[] {
                new EmailNotification("a@b.com", "Email"),
                new SMSNotification("123", "SMS"),
                new PushNotification("abc", "Push", "def")
        };

        for (Notification notification : notifications) {
            String output = captureOutput(() -> service.sendNotification(notification));
            assertTrue(output.contains("Sending to:"));
            assertTrue(output.contains("Message:"));
            assertTrue(output.contains("Sending"));
        }
    }
}