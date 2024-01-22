package ca.uwaterloo.cs446;

public class NumberSubject extends Subject{
    private state int;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        sendNotice();
    }

}