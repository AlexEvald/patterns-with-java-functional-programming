package template.main.classic.functional;

public class TemplateMainFunctional {
    public static void main(String[] args) {
        // Functional approach for processing text data
        DataProcessorFunc textProcessor = new DataProcessorFunc(
                (n) -> System.out.println("Reading data from a text file.."),
                (n) -> System.out.println("Processing text data."),
                (n) -> System.out.println("Writing data to a text file.")
        );
        textProcessor.process();

        // Functional approach for processing CSV data
        DataProcessorFunc csvProcessor = new DataProcessorFunc(
                (n) -> System.out.println("Reading data from a CSV file.."),
                (n) -> System.out.println("Processing CSV data."),
                (n) -> System.out.println("Writing data to a CSV file.")
        );
        csvProcessor.process();
    }
}
