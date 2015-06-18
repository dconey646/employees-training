package app;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import employee_stuff.Employee;

public class Hello {

	public static void main(String[] args) throws IOException {

		QueryExecutor queryExecutor = new QueryExecutor();
		
		displayMenu(queryExecutor);
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
		} catch (Exception e) {
			System.err.println("Invalid option selected!");
			System.exit(1);
		}

		return 0;
	}
	
	private static void displayMenu(QueryExecutor queryExecutor){
		System.out
			.print("Please select an option \n1. List all employees. \n2. Employee search.\n3. Add new Employee.");
		Scanner scanner = new Scanner(System.in);

		int initialOption = validateInput(scanner.next());
		while(initialOption != 0){
			switch(initialOption){
			case 1: List<Employee> employees = queryExecutor.selectAllEmployees();
					for (Employee employee : employees) {
						printEmployee(employee);
					}
					break;
			case 2: System.out.println("Please enter the ID of the employee.");
					int employeeId = validateInput(scanner.next());
					Employee employee = queryExecutor.getEmployeeById(employeeId);
					printEmployee(employee);
					break;
			case 3: break;
			default:System.out.println("Please enter a valid option");
					scanner.nextLine();
				try {
					Runtime.getRuntime().exec("clear");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					System.out.print("Please select an option \n1. List all employees. \n2. Employee search.\n3. Add new Employee.");
					Scanner scanner1 = new Scanner(System.in);

					initialOption = validateInput(scanner1.next());
		}
	}
	}
}
