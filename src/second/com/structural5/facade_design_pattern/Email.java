package second.com.structural5.facade_design_pattern;

public class Email {
	public static EmailBuilder getBuilder() {
		return new EmailBuilder();
	}

}
