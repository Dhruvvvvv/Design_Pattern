package first.com.creational5.abstract_factory_pattern;

public class AbstractFactoryDemoClient {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(new PCFactory("4Gb", "1TB", "Octa"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("4Gb", "1TB", "Octa"));
		System.out.println("Abstract factory of PC: " + pc);
		System.out.println("Abstract factory of Server: " + server);

	}

}
