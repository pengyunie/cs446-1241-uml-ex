package ca.uwaterloo.cs446;

abstract public class Observer {

    private Subject subject;

    abstract void update();

    abstract String getValue();
}