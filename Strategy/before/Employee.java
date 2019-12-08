public class Employee {
	private int type;
	private double salary;

	public static final int ENGINEER = 1;
	public static final int MANAGER = 2;
	public static final int STUDENT = 3;

	public Employee(double s, int t) {
		salary = s;
		type = t;
	}

	public double getSalary() {
		return salary;
	}

	public double getPayAmount() {
		if (type == Employee.ENGINEER)
			return salary;
		if (type == Employee.MANAGER)
			return salary * 2;
		if (type == Employee.STUDENT)
			return salary / 2;
		return salary;
	}
}