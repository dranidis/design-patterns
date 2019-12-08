public class StudentPaymentStrategy implements PaymentStrategy {
	public double getPayAmount(Employee empl) {
		return empl.getSalary() / 2;
	}
}