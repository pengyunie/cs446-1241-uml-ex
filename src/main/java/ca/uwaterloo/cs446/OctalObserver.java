package ca.uwaterloo.cs446;

public class OctalObserver extends Observer {
    private String octValue;
    private Subject subject;

    public OctalObserver(Subject s) {
        super();
        subject = s;
        subject.attach(this);
    }

    public void update() {
        octValue = Integer.toOctalString(subject.getState());
    }

    public String getValue() {
        return octValue;
    }
}
