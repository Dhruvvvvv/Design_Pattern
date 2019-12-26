package first.com.creational1.singleton_pattern;

class DBSingleton {
	private static DBSingleton singleton1 = new DBSingleton();

	// Constructor w/o parameter
	private DBSingleton() {

	}

	public static DBSingleton getInstance() {
		return singleton1;
	}
}

public class Singleton2_DBSingleton_EagerlyLoaded {

	// object created at the time of JVM starts.
	public static void main(String[] args) {
		DBSingleton obj1 = DBSingleton.getInstance();
		System.out.println("Object1:: " + obj1);
		DBSingleton obj2 = DBSingleton.getInstance();
		System.out.println("Object1:: " + obj2);

		if (obj1 == obj2) {
			System.out.println("Early instantiation Singleton example.");
		}
		// You can't create object using new keyword
		// DBSingleton obj= new DBSingleton();

	}

}
