package ca.uwaterloo.cs446;

public class OctalObserver extends Observer {
    private String m_octValue;
    private Subject m_subject;
    public OctalObserver(Subject subject) {
        m_subject = subject;
        m_subject.attach(this);
    }

    @Override
    public void update() {
        int state = m_subject.getState();
        m_octValue = Integer.toOctalString(state);    
    }

    @Override
    String getValue() {
        return m_octValue;
    }
    
}
