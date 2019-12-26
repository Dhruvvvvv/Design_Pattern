package first.com.creational7.abstract_factory_pattern1;

public class GoogleComputeEngineInstance implements Instance {
	
	 public GoogleComputeEngineInstance(Capacity capacity) {
		System.out.println("GoogleComputeEngineInstance with capacity: "+ capacity);
	}

	@Override
	public void start() {
		System.out.println("Google Engine Instance started.");
	}

	@Override
	public void stop() {
		System.out.println("Google Engine Instance stopped.");
	}

	@Override
	public void attachStorage(Storage storage) {
		System.out.println("Storage" + storage + " added.");
	}

	@Override
	public String toString() {
		return "GoogleInstance";
	}

}
