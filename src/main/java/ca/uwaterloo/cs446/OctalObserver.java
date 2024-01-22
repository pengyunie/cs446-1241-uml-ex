package ca.uwaterloo.cs446;

public class OctalObserver extends Observer {
    private Subject subject;
    private String octValue;

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
        update();
    }

    @Override
    public void update() {
        int state = subject.getState();
        octValue = Integer.toOctalString(state);
    }

    @Override
    public String getValue() {
        return octValue;
    }
}
