package org.example;

public abstract class Notification {
    public String recipient;
    public String message;

    public Notification(String recipient, String message) {
       this.recipient = recipient;
       this.message = message;
    }

    public abstract void send(String message);


}