package second.com.structural5.facade_design_pattern;

public abstract class Template {
	public enum TemplateType { Email, NewsLetter }

	public abstract String format(Object obj);
}
