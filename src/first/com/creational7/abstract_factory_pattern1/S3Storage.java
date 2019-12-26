package first.com.creational7.abstract_factory_pattern1;

public class S3Storage implements Storage {
	 public S3Storage( int Mib) {
		System.out.println("Allocated "+Mib+ "to S3Storage");
	}

	@Override
	public String getId() {
		return "S3Storage";
	}
	@Override
	public String toString() {
		return "Se Storage";
	}

}
