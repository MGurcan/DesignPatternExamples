package BehavioralPatterns.StatePattern.TCPConnectionExample;

/*
    State
    Defines an interface for encapsulating the behavior associated with a particular state of the Context
*/
public interface TCPState {
    public void open(TCPContext context);
    public void close(TCPContext context);
    public void ack(TCPContext context);
}
