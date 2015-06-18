package app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import employee_stuff.Employee;

public class Hello {

	public static void main(String[] args) {
		try {
			Connection connection = DbConnector.getInstance();
			System.out.println("It worked! Woop!!!");
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("SELECT number,salary,name,bonus,pay FROM employee"); 
			Employee employee;
			List<Employee> employeesList = new ArrayList();
			while(rs.next()){
				employee = new Employee();
				employee.setNumber(rs.getInt("number"));
				employee.setName(rs.getString("name"));
				employee.setSalary(rs.getFloat("salary"));
				employee.setBonus(rs.getFloat("bonus"));
				employee.setPay(rs.getFloat("pay"));
			
				employeesList.add(employee);
			}
		
			for(Employee emp : employeesList){
				System.out.println("Number: " + emp.getNumber());
				System.out.println("Name: " + emp.getName());
				System.out.println("Salary: £" + emp.getSalary());
				System.out.println("bonus: £" + emp.getBonus());
				System.out.println("Pay: " + emp.getPay());
			}
		} catch(Exception e){
			System.out.println("Problem executing query");
		}
	}
}
