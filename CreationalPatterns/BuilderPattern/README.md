# Creational Pattern
## Builder
---

Builder lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

### Builder Interface
The Builder interface declares product construction steps that are common to all types of builders.

    public interface ComputerBuilder {
        ComputerBuilder withCPU(String cpu);
        ComputerBuilder withRAM(String ram);
        ComputerBuilder withStorage(String storage);
        Computer build();
    }

### Concrete Builders
Concrete Builders provide different implementations of the construction steps. Concrete builders may produce products that don’t follow the common interface.

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

### Director
The Director class defines the order in which to call construction steps, so you can create and reuse specific configurations of products.

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