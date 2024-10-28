package template.processor;

public class CsvDataProcessor extends DataProcessor {
    @Override
    void readData() {
        System.out.println("Reading data from a CSV file.");
    }

    @Override
    void processData() {
        System.out.println("Processing CSV data.");
    }

    @Override
    void writeData() {
        System.out.println("Writing data to a CSV file.");
    }
}
