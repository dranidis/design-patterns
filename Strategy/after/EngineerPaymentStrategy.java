public class EngineerPaymentStrategy implements PaymentStrategy {
	public double getPayAmount(Employee empl) {
		return empl.getSalary();
	}
}