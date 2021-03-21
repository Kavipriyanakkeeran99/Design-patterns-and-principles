package observerpattern;

public class MessageSubscriberOne implements Observer {
	MessagePublisher publisher;
	
	MessageSubscriberOne(MessagePublisher publisher) {
		this.publisher = publisher;
		this.publisher.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("MessageSubscriberOne :: " + publisher.getState());
	}

}
