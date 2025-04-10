package org.example;

public abstract class Notification {
    public String recipient;
    public String message;

    public Notification(String recipient, String message) {
       this.recipient = recipient;
       this.message = message;
    }

    public abstract void send(String recipient, String message);

    public void displayInfo(String recipient, String message) {
        System.out.printf("Sending to: %s", recipient);
        System.out.printf("Message: %s", message);
        System.out.println("Sending");
    };
}