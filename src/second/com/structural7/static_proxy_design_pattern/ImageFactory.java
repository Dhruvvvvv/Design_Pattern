package second.com.structural7.static_proxy_design_pattern;

public class ImageFactory {
	public static Image getInstance(String name) {
		return new ImageProxy(name);
	}
}
