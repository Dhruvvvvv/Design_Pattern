package second.com.structural8.dynamic_proxy_design_pattern;

import javafx.geometry.Point2D;

public class Bitmap implements Image {

	private String name;
	private Point2D location;

	public Bitmap(String name) {
		System.out.println("File loaded from disk:: " + name);
		this.name = name;
	}

	@Override
	public void setLocation(Point2D point2d) {
		location = point2d;

	}

	@Override
	public Point2D getLocation() {
		return location;
	}

	@Override
	public void render() {
		System.out.println("Bitmap " + this.name + "\trendred.");

	}

}
