package first.com.creational1.singleton_pattern;

class DBSingleton1{
	private static DBSingleton1 single= null;
	
	private DBSingleton1() {
		
	}
	public static DBSingleton1 getInstance() {
		if(single==null) {
			single= new DBSingleton1();
		}
		return single;
	}
	
}
public class Singleton3_DBSingleton_LazilyLoaded {

	public static void main(String[] args) {
		DBSingleton1 obj1= DBSingleton1.getInstance();
		System.out.println("Object1:: "+obj1);
		DBSingleton1 obj2= DBSingleton1.getInstance();
		System.out.println("Object1:: "+obj2);
		if(obj1==obj2) {
			System.out.println("Lazily instantiation Singletone example");
		}

	}

}
