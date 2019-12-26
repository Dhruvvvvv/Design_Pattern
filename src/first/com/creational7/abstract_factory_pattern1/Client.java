package first.com.creational7.abstract_factory_pattern1;

import first.com.creational7.abstract_factory_pattern1.Instance.Capacity;

public class Client {
	private ResourceFactory factory;

	public Client(ResourceFactory factory) {
		this.factory = factory;
	}

	public Instance createServer(Instance.Capacity cap, int mb) {
		Instance instance = factory.getInstance(cap);
		Storage str = factory.getStorage(mb);
		instance.attachStorage(str);
		return instance;
	}

	public static void main(String[] args) {

		Client googleServer = new Client(new GoogleCloudResourceFactory());
		System.out.println("*******************Goggle Server******************");
		Instance gServer = googleServer.createServer(Capacity.large, 2048);
		gServer.start();
		gServer.stop();
		System.out.println("Google Server : " + gServer);
		System.out.println("*******************Aws Server******************");
		Client c = new Client(new AwsResourceFactory());
		Instance awsServer = c.createServer(Capacity.large, 1024);
		awsServer.start();
		awsServer.stop();
		System.out.println("Aws Server: " + awsServer);

	}

}
