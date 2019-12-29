package second.com.structural3.Decorator_design_pattern;

public class HtmlEncodedMessage implements Message {
	private Message msg;

	public HtmlEncodedMessage(Message msg) {
		this.msg = msg;
	}

	@Override
	public String getContent() {
		return "<Html>  " + msg.getContent() + "  </Html>";
	}
	

}
