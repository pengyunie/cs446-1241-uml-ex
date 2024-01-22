package ca.uwaterloo.cs446;

import java.util.ArrayList;

public class Subject {
    private ArrayList<Observer> observers;
    private int state;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void attach(Observer o) {
        observers.add(o);
    }

    public void sendNotice() {
        observers.forEach(o -> o.update());
    }

    public int getState() {
        return state;
    }

    public void setState(int s) {
        state = s;
    }

}
