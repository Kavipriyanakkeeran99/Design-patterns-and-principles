package mediatorpattern;

public class PremiumUser implements IUser {

	private String name;
	private IChatMediator chat;
	
	PremiumUser(IChatMediator chat,String name){
		this.chat=chat;
		this.name=name;
	}
	
	@Override
	public void receiveMessage(String message) {
		System.out.println(name+" the premium user has received the message "+message);
		}

	@Override
	public void sendMessage(String message) {
		chat.sendMessage(message,this);
	}
      
}
