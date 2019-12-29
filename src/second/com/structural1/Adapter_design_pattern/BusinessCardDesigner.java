package second.com.structural1.Adapter_design_pattern;

public class BusinessCardDesigner {

	public BusinessCardDesigner() {
	}

	public  String designCard(Customer customer) {
		StringBuffer sb = new StringBuffer();
		sb.append(customer.getName());
		sb.append(customer.getDesignation());
		sb.append(customer.getAddress());
		return sb.toString();

	}

}
