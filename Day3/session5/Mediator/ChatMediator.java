package mediatorpattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {
     
    private List<IUser> list;
	
	public ChatMediator() {
		list = new ArrayList<>();
	}

	@Override
	public void addUser(IUser user) {
           list.add(user);		
	}

	@Override
	public void sendMessage(String message,IUser sender) {
         for(IUser user:list) {
        	 if(user!=sender) {
        		 user.receiveMessage(message);
        	 }
         }
	}

	
	
	
	
}
