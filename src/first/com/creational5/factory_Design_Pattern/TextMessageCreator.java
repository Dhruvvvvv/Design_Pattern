package first.com.creational5.factory_Design_Pattern;

public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

}
