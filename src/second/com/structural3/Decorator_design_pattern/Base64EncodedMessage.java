package second.com.structural3.Decorator_design_pattern;

public class Base64EncodedMessage implements Message{
	
	private Message msg;
	
	public Base64EncodedMessage(Message msg) {
		this.msg= msg;
	}
	@Override
	public String getContent() {
		
		return "<Base64>  "+msg.toString()+"  <Base64>";
	}

}
