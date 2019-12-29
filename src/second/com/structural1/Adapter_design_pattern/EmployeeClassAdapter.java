package second.com.structural1.Adapter_design_pattern;

public class EmployeeClassAdapter extends Employee implements Customer {

	@Override
	public String getName() {
		return super.getFullName();
	}

	@Override
	public String getDesignation() {
		return super.getJobTitle();
	}

	@Override
	public String getAddress() {
		return super.getOfficeLoaction();
	}

}
