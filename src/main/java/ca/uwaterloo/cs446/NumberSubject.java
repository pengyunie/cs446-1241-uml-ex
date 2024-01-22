package ca.uwaterloo.cs446;

import java.lang.String;

public class NumberSubject extends Subject {
	private int state;

	public NumberSubject(int state) {
		this.state = state;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		super.sendNotice();
	}
}