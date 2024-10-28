package template.main.classic;

import template.processor.CsvDataProcessor;
import template.processor.DataProcessor;
import template.processor.TextDataProcessor;

public class TemplateMain {
    public static void main(String[] args) {
        DataProcessor textProcessor = new TextDataProcessor();
        textProcessor.process();

        DataProcessor csvProcessor = new CsvDataProcessor();
        csvProcessor.process();
    }
}
