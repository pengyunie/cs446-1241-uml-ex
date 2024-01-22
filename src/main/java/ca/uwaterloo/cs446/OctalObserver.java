package ca.uwaterloo.cs446;

public class OctalObserver extends Observer {
    private String octValue = "";

    // constructor wtih an argument
    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void update() {
        this.octValue = Integer.toOctalString(subject.getState());
    }

    public String getValue() {
        return this.octValue;
    }
}
