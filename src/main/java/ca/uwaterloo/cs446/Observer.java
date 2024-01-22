package ca.uwaterloo.cs446;

public abstract class Observer {
    private Subject subject = null;
    public abstract void update();
    public abstract String getValue();
}