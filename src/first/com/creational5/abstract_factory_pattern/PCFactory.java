package first.com.creational5.abstract_factory_pattern;

public class PCFactory implements ComputerAbstractFactory {
	private String cpu;
	private String ram;
	private String hdd;

	public PCFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {

		return new PC(ram, hdd, cpu);
	}

}
