package app;

import java.sql.Connection;

public class Hello {

	public static void main(String[] args) {
		Connection connection = DbConnector.getInstance();
		System.out.println("It worked! Woop!!!");
		
	}
}
