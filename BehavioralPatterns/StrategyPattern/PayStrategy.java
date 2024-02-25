package BehavioralPatterns.StrategyPattern;

// Strategy interface
public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
