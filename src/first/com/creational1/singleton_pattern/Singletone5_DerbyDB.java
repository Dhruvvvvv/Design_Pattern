package first.com.creational1.singleton_pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DerbyDB {
	private static DerbyDB instance = null;
	private Connection conn = null;

	private DerbyDB() {
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static DerbyDB getInstance() {
		if (instance == null) {
			synchronized (DerbyDB.class) {
				if (instance == null) {
					instance = new DerbyDB();
				}
			}
		}
		return instance;
	}

	public Connection getDerbyDBConnection() {
		if (conn == null) {
			synchronized (Connection.class) {
				if (conn == null) {
					try {
						String url = "jdbc:derby://localhost:1527/dbname;create=true";
						conn = DriverManager.getConnection(url);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return conn;
	}
}

public class Singletone5_DerbyDB {

	public static void main(String[] args) {

		DerbyDB instance= DerbyDB.getInstance();
		Connection conn= instance.getDerbyDBConnection();
		System.out.println("Derby connection:: "+conn);
	}

}
