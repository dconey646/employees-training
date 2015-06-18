package employee_stuff;

public class Consultant implements IPayable {

	private String name;
	private float dailyRate;
	private int daysWorked;
	private float pay;
	
	public Consultant(String name, float dailyRate, int daysWorked) {
		this.name = name;
		this.dailyRate = dailyRate;
		this.daysWorked = daysWorked;
	}
	
	public float calcPay() {
		return dailyRate * daysWorked;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(float dailyRate) {
		this.dailyRate = dailyRate;
	}

	public int getDaysWorked() {
		return daysWorked;
	}

	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}
	
	public String toString() {
		return String.format("Employee Name %s: " 
				+ "DailyRate: £%.2f, Days Worked: %d, Pay: £%.2f",
				this.getName(), this.getDailyRate(), this.getDaysWorked(), this.getPay());
	}

	public float getPay() {
		return pay;
	}

	public void setPay(float pay) {
		this.pay = pay;
	}
}
