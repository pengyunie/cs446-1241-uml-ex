package ca.uwaterloo.cs446;

public class OctalObserver extends Observer {
    String octValue;
    private Subject someSubject;

    public OctalObserver(Subject subject) {
        this.someSubject = subject;
    }

    @Override
    String getValue() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getValue'");
        return this.octValue;
    }

    @Override
    void update() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'update'");
        int subjectState = someSubject.getState();
        this.octValue = Integer.toOctalString(subjectState);
    }

}