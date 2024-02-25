package CreationalPatterns.BuilderPattern.ComputerExample;

/*
    CLIENT
    class or component that uses the builder pattern. It works with the director to construct the
    complex object without being concerned about the specific steps involved in the constructioN
 */
public class Main {
    public static void main(String[] args) {
        Computer highPerformanceComputer = new ComputerDirector(
            new StandarComputerBuilder()).constructHighPerformanceComputer();
        
        Computer lowPerformanceComputer = new ComputerDirector(
            new StandarComputerBuilder()).constructLowPerformanceComputer();

        Computer noStorageComputer = new ComputerDirector(
            new StandarComputerBuilder()).constructNoStorageComputer();

        System.out.println("High Performance Computer: \n" + highPerformanceComputer + "\n");
        System.out.println("Low Performance Computer: \n" + lowPerformanceComputer + "\n");
        System.out.println("No Storage Computer: \n" + noStorageComputer + "\n");

    }
}
