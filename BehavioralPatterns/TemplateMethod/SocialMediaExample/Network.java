package DesignPatterns.BehavioralPatterns.TemplateMethod.SocialMediaExample;

/*
    ABSTRACT CLASS
    Defines abstract primitive operations that concrete subclasses define to implement steps of an algorithm
    Implements a template method defining the skeleton of an algorithm.
    The template method calls primitive operations as well as operations defined in AbstractClass or those of other objects.
 */
public abstract class Network {
    String userName;
    String password;

    Network() {}

    // template method
    public final boolean post(String message) {
        if (logIn(this.userName, this.password)) {
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    // primitive methods
    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
