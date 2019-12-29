package second.com.structural7.static_proxy_design_pattern;

import javafx.geometry.Point2D;

public interface Image {

	void setLocation(Point2D point2d);
	Point2D getLocation();
	void render();
}
