package template.processor;

public class TextDataProcessor extends DataProcessor {

    public TextDataProcessor() {
    }

    @Override
    void readData() {
        System.out.println("Reading data from a text file.");
    }

    @Override
    void processData() {
        System.out.println("Processing text data.");
    }

    @Override
    void writeData() {
        System.out.println("Writing data to a text file.");
    }
}