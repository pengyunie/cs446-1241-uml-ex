package ca.uwaterloo.cs446;

abstract public class Subject {

    private List <Observer> observers = new LinkedList<>();
    
    abstract void attach(Observer observer);

    abstract void sendNotice();

    abstract int getState();

    abstract void setState(int state);
}