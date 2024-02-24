package DesignPatterns.CreationalPatterns.BuilderPattern.ComputerExample;

/*
    DIRECTOR
    responsible for orchestrating the construction process using a builder. It knows how to
    assemble the various components provided by the builder to create the final object.
 */
public class ComputerDirector {
    private ComputerBuilder builder;

    ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer constructHighPerformanceComputer() {
        return builder
                    .withCPU("i7")
                    .withRAM("16GB")
                    .withStorage("1TB SSD")
                    .build();
    }
    public Computer constructLowPerformanceComputer() {
        return builder
                    .withCPU("i5")
                    .withRAM("8GB")
                    .withStorage("256GB SSD")
                    .build();
    }
    public Computer constructNoStorageComputer() {
        return builder
                    .withCPU("i3")
                    .withRAM("4GB")
                    .build();
    }
}
