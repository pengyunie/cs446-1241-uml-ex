package ca.uwaterloo.cs446;

public class NumberSubject extends Subject {
    private int m_state;
    public NumberSubject(int state) {
        m_state = state;
    }

    @Override
    public int getState() {
        return m_state;
    }

    @Override
    public void setState(int state) {
        m_state = state;
        sendNotice();
    }   
}
