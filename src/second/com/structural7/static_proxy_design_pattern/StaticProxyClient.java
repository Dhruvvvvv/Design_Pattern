package second.com.structural7.static_proxy_design_pattern;

import javafx.geometry.Point2D;

public class StaticProxyClient {

	public static void main(String[] args) {
		Image img= ImageFactory.getInstance("Abc.bmp");
		img.setLocation(new Point2D(-10, 10));
		img.render();

		
		
	}

}
