package mediatorpattern;

public class MediatorPatternDemo {

	public static void main(String[] args) {

		ChatMediator chat=new ChatMediator();
		
		IUser user1=new BasicUser(chat,"user1");
		IUser user2=new PremiumUser(chat,"user2");

		chat.addUser(user1);
		chat.addUser(user2);
		
		chat.addUser(new BasicUser(chat,"user3"));
		chat.addUser(new PremiumUser(chat,"user4"));
		
		user2.sendMessage("Hello! This is mediator pattern");
	}

}
