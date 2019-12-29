package second.com.structural5.facade_design_pattern;

import second.com.structural5.facade_design_pattern.Template.TemplateType;

//Facade provides simple methods for client to use
public class EmailFacade {

	public boolean sendOrderEmail(Order order) {
		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
		Stationary stationary = StationaryFactory.createStationary();
		Email email = Email.getBuilder().withTemplate(template).withStationary(stationary).forObject(order).build();
		Mailer mailer = Mailer.getMailer();
		return mailer.send(email);
	}
}
