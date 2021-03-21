package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher extends Subject {
	private List<Observer> observers = new ArrayList<>();
	String state;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		notifyUpdate();
	}

	@Override
	public void attach(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyUpdate() {
		for(Observer o : observers)	
			o.update();
		System.out.println();
	}

}