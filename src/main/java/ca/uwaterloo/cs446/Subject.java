package ca.uwaterloo.cs446;

abstract public class Subject {

    private List <Observer> observers = new LinkedList<>();
    
    abstract void attach(Observer observer) {
        this.observers.add(observer);
    }

    abstract void sendNotice() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    abstract int getState();

    abstract void setState(int state);
}