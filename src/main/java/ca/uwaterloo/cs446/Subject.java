package ca.uwaterloo.cs446;

public class Subject {

    private List <Observer> observers = new LinkedList<>();
    
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void sendNotice() {
        this.observers.forEach(Observer::update);
    }

    abstract int getState();

    abstract void setState(int state);
}