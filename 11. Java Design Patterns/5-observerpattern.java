import java.util.ArrayList;
import java.util.List;

// Subject
class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}

// Observer Interface
interface Observer {
    void update(String state);
}

// Concrete Observers
class ObserverA implements Observer {
    @Override
    public void update(String state) {
        System.out.println("Observer A notified with state: " + state);
    }
}

class ObserverB implements Observer {
    @Override
    public void update(String state) {
        System.out.println("Observer B notified with state: " + state);
    }
}

public class ObserverPattern {
    public static void main(String[] args) {
        Subject subject = new Subject();

        subject.attach(new ObserverA());
        subject.attach(new ObserverB());

        subject.setState("State 1");
        subject.setState("State 2");
    }
}
