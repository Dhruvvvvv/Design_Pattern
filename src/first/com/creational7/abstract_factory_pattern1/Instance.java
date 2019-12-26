package first.com.creational7.abstract_factory_pattern1;

public interface Instance {
	enum Capacity {
		micro, small, large
	}

	public void start();

	public void stop();

	public void attachStorage(Storage storage);

}
