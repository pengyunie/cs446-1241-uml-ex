package ca.uwaterloo.cs446;

public class OctalObserver extends Observer {
    private String octValue = null;
    OctalObserver(Subject subject) {
        this.subject = subject;
    }
    public void update() {
        this.octValue = Integer.toOctalString(this.subject.getState());
    }
    public String getValue() {
        return this.octValue;
    }
}