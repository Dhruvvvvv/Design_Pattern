package first.com.creational1.singleton_pattern;

public class Singleton1_Runtime {

	public static void main(String[] args) {
		//runtime are singleton
		Runtime singleton1= Runtime.getRuntime();
		System.out.println("First runtime object:: "+singleton1);
		Runtime singleton2 = Runtime.getRuntime();
		System.out.println("First runtime object:: "+singleton1);
		//check if both equals then singleton
		
		if(singleton1==singleton2) {
			System.out.println("Singleton pattern followed by runtime object");
		}

	}

}
