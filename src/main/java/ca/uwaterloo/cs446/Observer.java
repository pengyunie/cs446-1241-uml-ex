package ca.uwaterloo.cs446;

public abstract class Observer {
    protected Subject subject = null;
    public abstract void update();
    public abstract String getValue();
}