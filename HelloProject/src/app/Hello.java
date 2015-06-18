package app;

import java.util.ArrayList;

import employee_stuff.Employee;

public class Hello {

	public static void main(String[] args) {
		Employee a = new Employee(1, "A. Smith", 50000);
		Employee b = new Employee(1, "B. Jones", 50000);
		Employee c = new Employee(1, "C. Doe", 50000);
		Employee d = new Employee(1, "D. Wong", 50000);
		
		String s = "Hello world..";
		
		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps.add(a);
		emps.add(b);
		emps.add(c);
		emps.add(d);
		
		for(Object x : emps) {
			Employee e = (Employee) x;
			System.out.println(e.getName() + " earns " + e.calcPay());
		}
		
		
	}
}




/* try {
	
	Class eClass = Class.forName("employee_stuff.Employee");
	Employee emp1 = (Employee) eClass.newInstance();
	
	try {
		emp1.setNumber("09"); 
	} catch (BadNumber bn) {
		System.err.println("Wrong format of number input!");
	}

	Employee emp2 = new Employee(12);
	Employee emp3 = new Employee(15, "Simon Watson");
	Employee emp4 = new Employee(20, "A. Smith2", 13000f);
	SalesEmployee emp5 = new SalesEmployee(25, "Sales employee",
			15000f, 0.015f, 1000f);

	Consultant consultant = new Consultant("Consultant", 250, 4);

	PayrollSystem ps = new PayrollSystem();
	emp1.setPay(ps.netPay(emp1));
	emp2.setPay(ps.netPay(emp2));
	emp3.setPay(ps.netPay(emp3));
	emp4.setPay(ps.netPay(emp4));
	emp5.setPay(ps.netPay(emp5));
	consultant.setPay(ps.netPay(consultant));

	emp1.setNumber(10);
	emp1.setSalary(15000.00f);
	emp1.setName("A. Smith");

	System.out.println(emp1);
	System.out.println(emp2);
	System.out.println(emp3);
	System.out.println(emp4);
	System.out.println(emp5);
	System.out.println(consultant);

} catch (ClassNotFoundException e) {
	System.err.println("Class not found: " + e.getMessage());
} catch (IllegalAccessException e) {
	System.err.println("IllegalAccessException");
} catch (InstantiationException e) {
	System.err.println("InstantiationException");
} */

