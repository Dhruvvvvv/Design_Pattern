package first.com.creational4.factory_pattern;

public class ShapeFactory {
	
	public Shape getShape(String shapeType) {
		if(shapeType==null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		if(shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		if(shapeType.equalsIgnoreCase("Hemisphere")) {
			return new Hemisphere();
		}
		if(shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;
		
	}
	

}
