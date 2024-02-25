package StructuralPatterns.Decorator.ReadWriteDataExample;

/*
    COMPONENT
 */
public interface DataSource {

    void writeData(String data);

    String readData();
}