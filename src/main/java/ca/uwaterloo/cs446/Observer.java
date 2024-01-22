package ca.uwaterloo.cs446;

public abstract class Observer {
    public Observer() {
        
    }

    abstract void update();

    abstract String getValue();
}
