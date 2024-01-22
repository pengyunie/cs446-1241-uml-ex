package ca.uwaterloo.cs446;

import java.util.LinkedList;
import java.util.List;

abstract public class Subject {
	private List<Observer> observers = new LinkedList<>();

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void sendNotice() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	abstract public int getState();

	abstract public void setState(int state);
}