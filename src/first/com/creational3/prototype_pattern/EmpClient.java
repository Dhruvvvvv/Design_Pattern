package first.com.creational3.prototype_pattern;

import java.util.List;

public class EmpClient {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp = new Employee();
		emp.loadData();
		// Got list 'emp' from DB
		// Cloning for Prototype Design Pattern
		Employee emp1 = (Employee) emp.clone();
		List<String> empList1 = emp1.getEmpList();
		empList1.add("Avinash");
		Employee emp2 = (Employee) emp.clone();
		List<String> empList2 = emp2.getEmpList();
		empList2.add("Java Design Pattern");

		System.out.println("Original: " + emp);
		System.out.println("CLoned1: " + empList1);
		System.out.println("CLoned2: " + empList2);

	}

}
