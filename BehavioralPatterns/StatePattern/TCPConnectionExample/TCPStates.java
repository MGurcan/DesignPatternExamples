package BehavioralPatterns.StatePattern.TCPConnectionExample;

public class TCPStates {
    static TCPEstablished ESTABLISHED = new TCPEstablished();
    static TCPListen LISTEN = new TCPListen();
    static TCPClosed CLOSED = new TCPClosed();
}

/*  Concrete States
    Each subclass implements behavior associated with a state of the Context
*/

class TCPClosed implements TCPState {
    public void open(TCPContext context) {
        System.out.println("OPEN: This state is CLOSED, next state is ESTABLISHED");
        context.changeStateTo(TCPStates.ESTABLISHED);
    }

    public void close(TCPContext context) {
        System.out.println("CLOSE: This state is CLOSED, next state is LISTEN");
        context.changeStateTo(TCPStates.LISTEN);
    }

    @Override
    public void ack(TCPContext context) {
        System.out.println("ACK received");
    }
}

class TCPEstablished implements TCPState {
    public void open(TCPContext context) {
        System.out.println("OPEN: This state is ESTABLISHED, next state is ESTABLISHED");
        context.changeStateTo(TCPStates.ESTABLISHED);
    }

    public void close(TCPContext context) {
        System.out.println("CLOSE: This state is ESTABLISHED, next state is CLOSED");
        context.changeStateTo(TCPStates.CLOSED);
    }

    @Override
    public void ack(TCPContext context) {
        System.out.println("ACK received");
    }
}

class TCPListen implements TCPState {
    public void open(TCPContext context) {
        System.out.println("OPEN: This state is LISTEN, next state is ESTABLISHED");
        context.changeStateTo(TCPStates.ESTABLISHED);
    }

    public void close(TCPContext context) {
        System.out.println("CLOSE: This state is LISTEN, next state is CLOSED");
        context.changeStateTo(TCPStates.CLOSED);
    }

    @Override
    public void ack(TCPContext context) {
        System.out.println("ACK received");
    }
}