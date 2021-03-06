package first.com.creational6.factory_Design_Pattern;

public abstract class MessageCreator {
	
	public abstract Message createMessage();
	
	public Message getMessage() {
		Message msg= createMessage();
		msg.display();
		return msg;
	}

}
 