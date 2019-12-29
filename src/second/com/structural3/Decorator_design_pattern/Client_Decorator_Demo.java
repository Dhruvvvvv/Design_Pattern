package second.com.structural3.Decorator_design_pattern;

public class Client_Decorator_Demo {

	public static void main(String[] args) {

		Message msg = new TextMessage("This is a text msg.");
		msg.getContent();
		System.out.println("*********HTML Decorator**********");
		Message decorator = new HtmlEncodedMessage(msg);

		decorator.getContent();
		System.out.println("*********Base64 Decorator**********");
		Message decorator1 = new Base64EncodedMessage(msg);

		decorator1.getContent();

	}

}
