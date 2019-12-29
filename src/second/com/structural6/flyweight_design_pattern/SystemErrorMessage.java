package second.com.structural6.flyweight_design_pattern;

public class SystemErrorMessage implements ErrorMessage {

	private String messageTemplate;
	private String helperUrlBase;

	public SystemErrorMessage(String messageTemplate , String helperUrlBase) {
		this.helperUrlBase= helperUrlBase;
		this.messageTemplate = messageTemplate;
	}

	@Override
	public String getText(String code) {
		return messageTemplate.replace("$errorCode", code) + helperUrlBase + code;
	}

}
