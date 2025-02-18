package observer.main.functional;

import observer.functional.FunctionalSubject;
import observer.functional.NamedObserver;

public class ObserverMainFunctional {
    public static void main(String[] args) {
        FunctionalSubject subject = new FunctionalSubject();

        // Creating named observers
        NamedObserver observer1 = new NamedObserver("Observer 1",
                message -> System.out.println("Observer 1 received: " + message));

        NamedObserver observer2 = new NamedObserver("Observer 2",
                message -> System.out.println("Observer 2 received: " + message));

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.notifyObservers("Hello, Functional Observers!");
    }
}
