package observerpattern;

public class MessageSubscriberThree implements Observer {
	
	MessagePublisher publisher;
	MessageSubscriberThree(MessagePublisher publisher) {
		this.publisher = publisher;
		this.publisher.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("MessageSubscriberThree :: " + publisher.getState());
	}

}
