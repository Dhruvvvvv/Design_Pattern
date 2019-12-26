package first.com.creational1.singleton_pattern;

class DBSingleton2 {
	// Lazily loaded, synchronized, singleton
	private static DBSingleton2 single = null;

	private DBSingleton2() {

	}

	public static DBSingleton2 getInstance() {
		if (single == null) {
			synchronized (DBSingleton2.class) {
				if (single == null) {
					single = new DBSingleton2();
				}
			}
		}
		return single;
	}

}

public class Singleton4_DBSingleton_LazilyLoaded_Synchronized {

	public static void main(String[] args) {
		DBSingleton2 obj1 = DBSingleton2.getInstance();
		System.out.println("Object1:: " + obj1);
		DBSingleton2 obj2 = DBSingleton2.getInstance();
		System.out.println("Object1:: " + obj2);
		if (obj1 == obj2) {
			System.out.println("Lazily instantiation Singletone example");
		}

	}

}
