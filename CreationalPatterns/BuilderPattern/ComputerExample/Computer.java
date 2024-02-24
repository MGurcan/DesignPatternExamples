package DesignPatterns.CreationalPatterns.BuilderPattern.ComputerExample;

/*
    PRODUCT
    object being constructed. It is often a composition of several parts. The final result is
    returned to the client after the construction process is complete.
 */
public class Computer {
    public String CPU;
    public String storage;
    public String RAM;

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage + "]";
    }
}
