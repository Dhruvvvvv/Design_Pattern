package first.com.creational5.abstract_factory_pattern;

public class ComputerFactory {
	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}

}
