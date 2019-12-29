package second.com.structural7.static_proxy_design_pattern;

import javafx.geometry.Point2D;

public class Bitmap implements Image {

	private String name;
	private Point2D location;

	public Bitmap(String name) {
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
		System.out.println("Bitmap " + name + "\trendred.");

	}

}
