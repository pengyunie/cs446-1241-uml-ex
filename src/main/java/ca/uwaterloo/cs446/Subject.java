package ca.uwaterloo.cs446;

import java.util.List;
import java.util.LinkedList;

public abstract class Subject {
    abstract int getState();

    abstract void setState(int state);

    public Subject() {
        
    }

    List<Observer> observers = new LinkedList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void sendNotice() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
