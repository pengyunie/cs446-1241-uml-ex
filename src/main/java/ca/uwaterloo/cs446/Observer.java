package ca.uwaterloo.cs446;

abstract public class Observer {
    protected Subject subject;

    abstract public void update();

    abstract public String getValue();
}
