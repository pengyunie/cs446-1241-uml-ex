package ca.uwaterloo.cs446;

public abstract class Observer {
    Observer() {}
    public abstract void update();
    abstract String getValue();
}
