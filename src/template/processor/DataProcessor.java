package template.processor;

public abstract class DataProcessor {

    // Template method
    public final void process() {
        readData();
        processData();
        writeData();
    }

    abstract void readData();
    abstract void processData();
    abstract void writeData();
}
