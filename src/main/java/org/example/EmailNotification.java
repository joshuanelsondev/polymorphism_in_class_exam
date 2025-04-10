package org.example;

public class EmailNotification extends Notification {

    public EmailNotification(String recipient, String message) {
       super(recipient, message);
    }

   @Override
   public void send(String recipient, String message) {
       System.out.printf("Sending to: %s", recipient);
       System.out.printf("Email content: %s", message);
       System.out.println("Connecting to SMTP server...");
       System.out.println("Sending email...");
   }

  
}
