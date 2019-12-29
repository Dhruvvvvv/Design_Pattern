package second.com.structural8.dynamic_proxy_design_pattern;

import javafx.geometry.Point2D;

public class DynamicProxyClientDemo {

	public static void main(String[] args) {
		Image img = ImageFactory.getImage("A.bmp");
		img.setLocation(new Point2D(-10,10));
		
		System.out.println(img.getLocation());
		System.out.println("*****************rendering***********************");
		img.render();
	}

}
