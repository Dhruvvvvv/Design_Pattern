package first.com.creational7.abstract_factory_pattern1;

public interface ResourceFactory {
	
	public Instance getInstance(Instance.Capacity capacity);

	public Storage getStorage(int Mib);

}
