public class Main {
	public static void main(String arg[]) {
		int salary = 1000;
		Employee student = new Employee(salary, new StudentPaymentStrategy());
		System.out.println("Student : " + student.getPayAmount());

		Employee engineer = new Employee(salary, new EngineerPaymentStrategy());
		System.out.println("Engineer : " + engineer.getPayAmount());

		Employee manager = new Employee(salary, new ManagerPaymentStrategy());
		System.out.println("Manager : " + manager.getPayAmount());
	}
}