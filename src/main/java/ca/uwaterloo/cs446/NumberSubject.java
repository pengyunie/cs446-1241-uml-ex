package ca.uwaterloo.cs446;

public class NumberSubject extends Subject {
    private int state;

    public NumberSubject(int state) {
        this.state = state;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public int getState() {
        return state;
    }

    @Override
    public void setState(int state) {
        this.state = state;
        sendNotice();
    }
}
