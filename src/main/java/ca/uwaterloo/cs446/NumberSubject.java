package ca.uwaterloo.cs446;

public class NumberSubject extends Subject {
    public NumberSubject(int state) {
        super();
        this.setState(state);
        sendNotice();
    }
}
