package app;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnector {

	private static Connection connection;

	private DbConnector() {

	}

	public static Connection getInstance() {
		if (connection == null) {
			connection = createConnection();
			return connection;
		} else {
			return connection;
		}
	}

	private static Connection createConnection() {
		try {
			Class<?> driver = Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost/employees", "employees_user",
					"password");
			return connection;
		} catch (Exception e) {
			System.err
					.println("There was a problem connecting to the database, please contact your sysadmin.");
			System.exit(1);
		}

		return null;
	}
}
