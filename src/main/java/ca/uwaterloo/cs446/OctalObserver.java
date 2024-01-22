package ca.uwaterloo.cs446;

abstract public class OctalObserver extends Observer {
    private String octValue;

    // constructor wtih an argument
    abstract public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    abstract void update() {
        this.octValue = Integer.toOctalString(subject.getState())
    }

    abstract String getValue() {
        return this.octValue;
    }
}
