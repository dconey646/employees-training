package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import employee_stuff.Employee;

public class QueryExecutor {

	private Connection connection;

	public QueryExecutor() {
		connection = DbConnector.getInstance();
	}

	public List<Employee> selectAllEmployees() {
		List<Employee> employeesList = new ArrayList<Employee>();

		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement
					.executeQuery("SELECT number,salary,name,bonus,pay FROM employee");

			while (resultSet.next()) {
				Employee employee = new Employee();
				employee.setNumber(resultSet.getInt("number"));
				employee.setName(resultSet.getString("name"));
				employee.setSalary(resultSet.getFloat("salary"));
				employee.setBonus(resultSet.getFloat("bonus"));
				employee.setPay(resultSet.getFloat("pay"));
				employeesList.add(employee);
			}
		} catch (Exception e) {
			System.err
					.println("An error occurred retrieving all employees. Please contact your sysadmin.");
			System.exit(1);
		}

		return employeesList;
	}

	public Employee getEmployeeById(int id) {

		Employee employee = null;

		try {
			PreparedStatement statement = connection
					.prepareStatement("SELECT number,salary,name,bonus,pay FROM employee WHERE number = ?");
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				employee = new Employee();
				employee.setNumber(resultSet.getInt("number"));
				employee.setName(resultSet.getString("name"));
				employee.setSalary(resultSet.getFloat("salary"));
				employee.setBonus(resultSet.getFloat("bonus"));
				employee.setPay(resultSet.getFloat("pay"));
			}

			return employee;

		} catch (Exception e) {
			System.err
					.println("An error occurred retrieving selected employee. Please contact your sysadmin and give them this info:");
			e.printStackTrace();
			System.exit(1);
		}

		return null;
	}
}
