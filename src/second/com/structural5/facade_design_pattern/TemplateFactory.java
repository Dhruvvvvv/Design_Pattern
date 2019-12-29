package second.com.structural5.facade_design_pattern;

import second.com.structural5.facade_design_pattern.Template.TemplateType;

public class TemplateFactory {
	public static Template createTemplateFor(TemplateType type) {
		switch (type) {
		case Email:
			return new OrderEmailTemplate();
		default:
			throw new IllegalArgumentException("Unknown TemplateType");
		}

	}
}
