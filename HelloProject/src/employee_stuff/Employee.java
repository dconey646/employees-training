package employee_stuff;

public class Employee implements IPayable {
	
	private int number;
	private float salary;
	private String name;
	private float bonus;
	private float pay;
	
	private final float MIN_SALARY = 7000f;
	
	public Employee() {
		this.setBonus(50f);
	}
	
	public Employee(int number) {
		this();
		this.number = number;
	}
	
	public Employee(int number, String name) {
		this(number);
		this.name = name;		
	}
	
	public Employee(int number, String name, float salary) {
		this(number, name);
		this.salary = salary;
	}
	
	public float calcPay() {
		return salary / 12;
	}
	
	public float getSalary() {
		return this.salary;
	}
	
	public boolean setSalary(float salary) {
		if(salary >= MIN_SALARY) {
			this.salary = salary;
			return true;
		} else {
			return false;
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setNumber(String number) throws BadNumber {
		
		try {
			int i = Integer.parseInt(number);
			setNumber(i);
		} catch (NumberFormatException bn) {
			throw new BadNumber(bn);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
	public String toString() {
		return String.format("Employee %d: %s, £%.2f. " 
				+ "Monthly gross pay: £%.2f. Bonus: £%.2f, Pay: £%.2f",
				this.getNumber(), this.getName(), this.getSalary(), this.calcPay(), this.getBonus(), this.getPay());
	}

	public float getPay() {
		return pay;
	}

	public void setPay(float pay) {
		this.pay = pay;
	}
}
