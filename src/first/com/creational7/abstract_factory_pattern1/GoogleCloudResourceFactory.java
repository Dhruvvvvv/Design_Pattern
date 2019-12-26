package first.com.creational7.abstract_factory_pattern1;

import first.com.creational7.abstract_factory_pattern1.Instance.Capacity;

public class GoogleCloudResourceFactory implements ResourceFactory {

	@Override
	public Instance getInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage getStorage(int Mib) {
		return new GoogleCloudStorage(Mib);
	}
}
