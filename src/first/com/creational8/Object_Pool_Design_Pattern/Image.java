package first.com.creational8.Object_Pool_Design_Pattern;

import com.sun.javafx.geom.Point2D;

public interface Image extends Poolable {
	void draw();

	Point2D getLocation();

	void setLocation(Point2D location);

}
