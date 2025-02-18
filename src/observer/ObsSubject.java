package observer;

import java.util.ArrayList;
import java.util.List;

public class ObsSubject {
    private List<Observer> observers = new ArrayList<>();

    public ObsSubject(List<Observer> observers) {
        this.observers = observers;
    }

    public ObsSubject() {
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
