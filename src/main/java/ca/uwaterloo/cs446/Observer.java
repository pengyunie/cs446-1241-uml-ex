package ca.uwaterloo.cs446;

abstract public class Observer {

    public Subject subject;

    abstract void update();

    abstract String getValue();
}