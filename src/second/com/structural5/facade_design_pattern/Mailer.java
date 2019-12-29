package second.com.structural5.facade_design_pattern;

public class Mailer {
	private static final Mailer MAILER = new Mailer();

	public static Mailer getMailer() {
		return MAILER;
	}

	private Mailer() {

	}

	public boolean send(Email email) {
		return true;
	};
}
