package DesignPatterns.BehavioralPatterns.StatePattern.TCPConnectionExample;

/**
    Client
    Is responsible for switching between states
 */
public class Main {

    public static void main(String[] args) {
        TCPConnection connection = new TCPConnection();
        connection.open();
        connection.open();
        connection.open();
        connection.ack();
        connection.close();
    }
}