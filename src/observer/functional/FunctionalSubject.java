package observer.functional;

import java.util.ArrayList;
import java.util.List;

public class FunctionalSubject {
    private final List<NamedObserver> observers = new ArrayList<>();

    public void addObserver(NamedObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(NamedObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        observers.forEach(observer -> {
            System.out.println("Notifying: " + observer.getName());
            observer.notify(message);
        });
    }
}
