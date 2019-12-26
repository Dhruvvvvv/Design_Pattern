package first.com.creational8.Object_Pool_Design_Pattern;

import com.sun.javafx.geom.Point2D;

//concrete reusable

public class Bitmap implements Image {
	private Point2D location;
	private String name;

	public Bitmap(String name) {
		this.name = name;

	}

	@Override
	public void draw() {
		System.out.println("Drawing " + name + "@ " + location);
	}

	@Override
	public Point2D getLocation() {
		return location;
	}

	@Override
	public void setLocation(Point2D location) {
		this.location = location;

	}

	@Override
	public void reset() {
		location = null;

	}

}
