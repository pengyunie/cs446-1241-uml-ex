package ca.uwaterloo.cs446;

abstract public class NumberSubject {
    
    private int state;

    // constructor wtih an argument
    abstract void NumberSubject(int state);

    abstract int getState();

    abstract void setState(int state);
}