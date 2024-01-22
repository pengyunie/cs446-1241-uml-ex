package ca.uwaterloo.cs446;

public abstract class Subject {
    private LinkedList<Observer> observers = new LinkedList<Observer>();
    public void attach(Observer observer) {
        this.observers.add(observer);
    }
    public void sendNotice() {
        for (Observer o : observers) {
            o.update();
        }
    }
    public abstract int getState();
    public abstract void setState();
}