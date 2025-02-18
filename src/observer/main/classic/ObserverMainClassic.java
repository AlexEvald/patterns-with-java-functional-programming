package observer.main.classic;


import observer.ConcreteObserver;
import observer.Observer;
import observer.ObsSubject;

public class ObserverMainClassic {

    public static void main(String[] args) {
        ObsSubject obdSubject = new ObsSubject();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        obdSubject.addObserver(observer1);
        obdSubject.addObserver(observer2);

        obdSubject.notifyObservers("Hello Observers!");

    }


}
