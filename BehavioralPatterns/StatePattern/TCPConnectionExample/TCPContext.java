package BehavioralPatterns.StatePattern.TCPConnectionExample;

/*
    Context
    Defines interface of interest to clients  
*/
public interface TCPContext {
    public void changeStateTo(TCPState state);
}
