package app;

import java.util.List;
import java.util.Scanner;

import employee_stuff.Employee;

public class Hello {

	public static void main(String[] args) {
		
		QueryExecutor queryExecutor = new QueryExecutor();
		
		System.out.print("Please select an option \n1. List all employees. \n2. Employee search.");
		Scanner scanner = new Scanner(System.in);
		
		int initialOption = validateInput(scanner.next());
		
		if(initialOption == 1) {
			List<Employee> employees = queryExecutor.selectAllEmployees();
			
			for(Employee employee : employees) {
				printEmployee(employee);
			}
		} else if (initialOption == 2) {
			System.out.println("Please enter the ID of the employee.");
			int employeeId = validateInput(scanner.next());
			
			Employee employee = queryExecutor.getEmployeeById(employeeId);
			printEmployee(employee);
		}
		
		scanner.close();
	}
	
	private static void printEmployee(Employee employee) {
		System.out.println("Number: " + employee.getNumber());
		System.out.println("Name: " + employee.getName());
		System.out.println("Salary: " + employee.getSalary());
		System.out.println("Bonus: " + employee.getBonus());
	}
	
	private static int validateInput(String input) {
		
		int out;
		
		try {
			out = Integer.parseInt(input);
			return out;
		} catch(Exception e) {
			System.err.println("Invalid option selected!");
			System.exit(1);
		}
		
		return 0;
	}
}
