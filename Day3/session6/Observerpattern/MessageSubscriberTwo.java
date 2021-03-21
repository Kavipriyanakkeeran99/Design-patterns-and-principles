package observerpattern;

public class MessageSubscriberTwo implements Observer {
	
	MessagePublisher publisher;
	
	MessageSubscriberTwo(MessagePublisher publisher) {
		this.publisher = publisher;
		this.publisher.attach(this);
	}

	@Override
	public void update() {
		System.out.println("MessageSubscriberTwo :: " + publisher.getState());
	}
	
}