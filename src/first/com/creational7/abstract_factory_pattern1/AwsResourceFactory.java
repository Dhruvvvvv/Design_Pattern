package first.com.creational7.abstract_factory_pattern1;

import first.com.creational7.abstract_factory_pattern1.Instance.Capacity;

public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance getInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage getStorage(int Mib) {
		return new S3Storage(Mib);
	}

	

}
