package second.com.structural6.flyweight_design_pattern;

import second.com.structural6.flyweight_design_pattern.ErrorMessageFactory.ErrorType;

public class FlyWeightClient {
	public static void main(String[] args) {
		SystemErrorMessage msg1 = ErrorMessageFactory.getInstance().getError(ErrorType.GenericSystemError);
		System.out.println(msg1.getText("4056"));
		
		UserBannedErrorMessage msg2 = ErrorMessageFactory.getInstance().getUserBannedMessage("1202");
		System.out.println(msg2.getText(null));
	}
}
