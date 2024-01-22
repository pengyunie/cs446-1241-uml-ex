package ca.uwaterloo.cs446;

import java.util.ArrayList;
import java.util.List;

abstract class Subject {
    private List<Observer> m_observers = new ArrayList<>();

    public Subject() {}
    public void attach(Observer obs) {
        m_observers.add(obs);
    }

    protected void sendNotice() {
        m_observers.forEach(obs -> obs.update());
    }
    public abstract int getState();
    public abstract void setState(int state);
}
