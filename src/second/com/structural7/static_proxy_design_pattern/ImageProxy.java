package second.com.structural7.static_proxy_design_pattern;

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
		this.location = point2d;
	}

	@Override
	public Point2D getLocation() {
		return location;
	}

	@Override
	public void render() {
		if (image == null) {
			image = new Bitmap(name);
			image.setLocation(location);
		} else
			image.setLocation(location);
		image.render();

	}

}
