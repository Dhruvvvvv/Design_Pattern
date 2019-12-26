package first.com.creational7.abstract_factory_pattern1;

public class GoogleCloudStorage implements Storage {

	public GoogleCloudStorage(int Mib) {
		System.out.println("Allocated" + Mib + " to Google Drive.");
	}

	@Override
	public String getId() {
		return "Google Drive";
	}
	@Override
	public String toString() {
		return "Google Drive";
	}

}
