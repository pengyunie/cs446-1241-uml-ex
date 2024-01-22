package ca.uwaterloo.cs446;

import java.lang.String;

public class OctalObserver extends Observer {
	private String octValue;
	private Subject subject;

	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	public void update() {
		octValue = Integer.toOctalString(this.subject.getState());
	}

	public String getValue() {
		return octValue;
	}
}