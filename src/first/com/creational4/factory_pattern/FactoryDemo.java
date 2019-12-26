package first.com.creational4.factory_pattern;

public class FactoryDemo {

	public static void main(String[] args) {
		
		//Creating object for factory which can create objects for many classes
		ShapeFactory factory = new ShapeFactory();
		//calling getFactory() method to get Circle object
		Shape shape = factory.getShape("Circle");
		System.out.println(shape);
		//call draw method of Circle class
		shape.draw();
		Shape shape1= factory.getShape("rectangle");
		System.out.println(shape1);
		shape1.draw();

	}

}
