package ca.uwaterloo.cs446;
import java.util.List;
import java.util.LinkedList;

abstract public class Subject {
    private List<Observer> observers = new LinkedList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    void sendNotice() {
        for (Observer observer: observers) {
            observer.update();
        }
    }
    abstract public int getState();
    abstract public void setState(int state);
}