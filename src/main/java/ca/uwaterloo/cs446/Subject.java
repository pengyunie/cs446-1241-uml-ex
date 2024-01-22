package ca.uwaterloo.cs446;

import java.util.LinkedList;
import java.util.List;

abstract public class Subject {

    List<Observer> observers = new LinkedList<Observer>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void sendNotice() {
        observers.forEach(Observer::update);
    }

    abstract public int getState();

    abstract void setState(int state);
}
