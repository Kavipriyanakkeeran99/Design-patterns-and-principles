package mediatorpattern;

public interface IChatMediator {
   public void addUser(IUser user);
   public void sendMessage(String message,IUser sender);
}
