package first.com.creational7.abstract_factory_pattern1;

public class Ec2Instance implements Instance {
	public Ec2Instance(Capacity capacity) {

		System.out.println("Ec2Instance with capacity: " + capacity);

	}

	@Override
	public void start() {
		System.out.println("Ec2 instance started..");

	}

	@Override
	public void stop() {
		System.out.println("Ec2 instance stopped.");

	}

	@Override
	public void attachStorage(Storage storage) {
		System.out.println("Ec2" + storage + " storage is added.");

	}

	@Override
	public String toString() {
		return "Ec2 instance";
	}

}
