package ca.uwaterloo.cs446;

import java.util.ArrayList;

public abstract class Subject {
    private ArrayList<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void attach(Observer o) {
        observers.add(o);
    }

    public void sendNotice() {
        observers.forEach(o -> o.update());
    }

    public abstract int getState();

    public abstract void setState(int s);

}
