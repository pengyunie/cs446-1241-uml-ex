package ca.uwaterloo.cs446;

abstract public class Subject {

    private List <Observer> observers = new LinkedList<>();
    
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void sendNotice() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    abstract int getState();

    abstract void setState(int state);
}