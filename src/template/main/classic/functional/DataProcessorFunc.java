package template.main.classic.functional;

import java.util.function.Consumer;

public class DataProcessorFunc {

    private final Consumer<Void> readData;
    private final Consumer<Void> processData;
    private final Consumer<Void> writeData;

    public DataProcessorFunc(Consumer<Void> readData, Consumer<Void> processData, Consumer<Void> writeData) {
        this.readData = readData;
        this.processData = processData;
        this.writeData = writeData;
    }

    public void process() {
        readData.accept(null);
        processData.accept(null);
        writeData.accept(null);
    }

}
