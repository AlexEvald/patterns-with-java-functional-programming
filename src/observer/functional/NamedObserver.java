package observer.functional;

import java.util.function.Consumer;

public class NamedObserver {
    private final String name;
    private final Consumer<String> observerFunction;

    public NamedObserver(String name, Consumer<String> observerFunction) {
        this.name = name;
        this.observerFunction = observerFunction;
    }

    public String getName() {
        return name;
    }

    public void notify(String message) {
        observerFunction.accept(message);
    }
}
