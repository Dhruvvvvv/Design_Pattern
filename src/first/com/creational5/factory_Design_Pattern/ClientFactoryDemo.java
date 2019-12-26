package first.com.creational5.factory_Design_Pattern;

public class ClientFactoryDemo {

	public static Message printMessage(MessageCreator creator) {
		Message msg = creator.createMessage();
		System.out.println(msg);
		return msg;
	}

	public static void main(String[] args) {

		Message m = printMessage(new JSONMessageCreator());
		m.display();
	}
}
