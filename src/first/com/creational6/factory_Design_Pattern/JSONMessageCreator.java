package first.com.creational6.factory_Design_Pattern;

public class JSONMessageCreator extends MessageCreator{

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

	

}
