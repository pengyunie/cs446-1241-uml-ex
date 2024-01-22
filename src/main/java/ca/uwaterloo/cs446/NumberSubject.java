package ca.uwaterloo.cs446;

public class NumberSubject extends Subject {
    
    private int state;

    // constructor wtih an argument
    public NumberSubject(int state){
        this.state = state;
    }

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
        this.sendNotice();
    }
}