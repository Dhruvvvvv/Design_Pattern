package first.com.creational3.prototype_pattern;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {
	private List<String> empList;

	public Employee() {
		empList = new ArrayList<String>();
	}

	public Employee(List list) {
		this.empList = list;
	}

	// Load data from DB
	public void loadData() {
		empList.add("Khaja");
		empList.add("Amar");
		empList.add("Bala G");
		empList.add("Sai Snehi");
		empList.add("Naresh");
	}

	public List<String> getEmpList() {
		return empList;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> tempList = new ArrayList<String>();
		List<String> list = this.getEmpList();
		for (String str : list) {
			tempList.add(str);
		}
		return new Employee(tempList);
	}

}
