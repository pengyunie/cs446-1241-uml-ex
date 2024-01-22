package ca.uwaterloo.cs446;

public class NumberSubject extends Subject {
    int state;

    public NumberSubject(int state) {
        this.state = state;
    }

    @Override
    int getState() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getState'");
        return this.state;
    }

    @Override
    void setState(int state) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'setState'");
        this.state = state;
        this.sendNotice();
    }

}
