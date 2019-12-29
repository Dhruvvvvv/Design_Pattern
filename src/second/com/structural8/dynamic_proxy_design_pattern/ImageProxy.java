package second.com.structural8.dynamic_proxy_design_pattern;

import javafx.geometry.Point2D;

public class ImageProxy implements Image {

	private String name;
	private Point2D location;
	private Bitmap image;

	public ImageProxy(String name) {
		this.name = name;
	}

	@Override
	public void setLocation(Point2D point2d) {
		if (image != null)
			image.setLocation(point2d);
		else
			location = point2d;
	}

	@Override
	public Point2D getLocation() {
		if (image != null) {
			return image.getLocation();
		}
		return location;
	}

	@Override
	public void render() {
		if (image == null) {
			image = new Bitmap(name);
			if (location != null)
				image.setLocation(location);
		}
		image.render();
	}

}
