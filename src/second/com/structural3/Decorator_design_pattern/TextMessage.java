package second.com.structural3.Decorator_design_pattern;

public class TextMessage implements Message {

	private String msg;

	public TextMessage(String msg) {
		this.msg = msg;
	}

	@Override
	public String getContent() {
		return "TextMessage getContent() mthod." ;
	}

}
