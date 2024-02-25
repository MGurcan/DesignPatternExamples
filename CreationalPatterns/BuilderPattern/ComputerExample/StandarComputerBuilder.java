package CreationalPatterns.BuilderPattern.ComputerExample;

/*
    CONCRETE BUILDER
    classes that implement the builder interface. They are responsible for constructing
    and assembling parts of the complex object. Different concrete builders can produce different
    representations of the object.
 */
public class StandarComputerBuilder implements ComputerBuilder{

    private Computer computer = new Computer();

    @Override
    public ComputerBuilder withCPU(String cpu) {
        computer.CPU = cpu;
        return this;
    }

    @Override
    public ComputerBuilder withRAM(String ram) {
        computer.RAM = ram;
        return this;
    }

    @Override
    public ComputerBuilder withStorage(String storage) {
        computer.storage = storage;
        return this;
    }

    @Override
    public Computer build() {
        return computer;
    }
}