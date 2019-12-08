public class Main {
	public static void main(String arg[]) {
		int salary = 1000;
		Employee student = new Employee(salary, Employee.STUDENT);
		System.out.println("Student : " + student.getSalary());

		Employee engineer = new Employee(salary, Employee.ENGINEER);
		System.out.println("Engineer : " + engineer.getSalary());

		Employee manager = new Employee(salary, Employee.MANAGER);
		System.out.println("Manager : " + manager.getSalary());
	}
}