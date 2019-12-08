public class Employee {
	private PaymentStrategy paymentStrategy;
	private double salary;

	public Employee(double s, PaymentStrategy strategy) {
		salary = s;
		paymentStrategy = strategy;
	}

	public double getSalary() {
		return salary;
	}

	public double getPayAmount() {
		return paymentStrategy.getPayAmount(this);
	}

}