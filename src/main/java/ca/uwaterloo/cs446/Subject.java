package ca.uwaterloo.cs446;

import java.util.LinkedList;
import java.util.List;

abstract public class Subject {
    public List<Observer> observers = new LinkedList<Observer>();

    abstract public void attach(Observer observer);

    public void sendNotice() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    abstract public int getState();

    abstract public void setState(int state);
}
