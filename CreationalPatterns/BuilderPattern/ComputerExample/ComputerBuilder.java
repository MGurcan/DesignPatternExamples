package CreationalPatterns.BuilderPattern.ComputerExample;

/*
    BUILDER
    an interface or an abstract class that declares the construction steps needed for building a
    complex object. Each concrete builder provides its own implementation of these steps
 */

public interface ComputerBuilder {
    ComputerBuilder withCPU(String cpu);
    ComputerBuilder withRAM(String ram);
    ComputerBuilder withStorage(String storage);
    
    Computer build();
}
