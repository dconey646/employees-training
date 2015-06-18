package employee_stuff;

public class SalesEmployee extends Employee {

	private float commissionRate;
	private float salesTotal;
	
	public SalesEmployee() {
		// TODO Auto-generated constructor stub
	}

	public SalesEmployee(int number) {
		super(number);
		// TODO Auto-generated constructor stub
	}

	public SalesEmployee(int number, String name) {
		super(number, name);
		// TODO Auto-generated constructor stub
	}

	public SalesEmployee(int number, String name, float salary) {
		super(number, name, salary);
		// TODO Auto-generated constructor stub
	}
	
	public SalesEmployee(int number, String name, float salary, float commissionRate) {
		super(number, name, salary);
		this.commissionRate = commissionRate;
	}
	
	public SalesEmployee(int number, String name, float salary, float commissionRate, float salesTotal) {
		this(number, name, salary, commissionRate);
		this.setSalesTotal(salesTotal);
	}

	public float getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(float commissionRate) {
		this.commissionRate = commissionRate;
	}

	public float getSalesTotal() {
		return salesTotal;
	}

	public void setSalesTotal(float salesTotal) {
		this.salesTotal = salesTotal;
	}
	
	@Override
	public float calcPay() {
		return (getSalary() / 12) + (commissionRate * salesTotal);
	}

}
