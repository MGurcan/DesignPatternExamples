package DesignPatterns.BehavioralPatterns.StatePattern.TCPConnectionExample;

public class TCPConnection implements TCPContext{

    private TCPState state;

    public TCPConnection() {
        System.out.println("TCP connection created -> Initial state: CLOSED");
        this.state = TCPStates.CLOSED;
    }

    public void open() {
        state.open(this);
    }

    public void close() {
        state.close(this);
    }

    public void ack(){
        state.ack(this);
    }

    @Override
    public void changeStateTo(TCPState state) {
        this.state = state;
    }
    
}
