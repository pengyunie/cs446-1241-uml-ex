package ca.uwaterloo.cs446;

public class OctalObserver extends Observer{
    private String octValue;

    public OctalObserver(subject: Subject) {
        subject.attach(self)
    }

    public void update() {
        Integer.toOctalString(octValue);
        subject.getState();
    }
    public String getValue() {
        return this.octValue;
    }
}