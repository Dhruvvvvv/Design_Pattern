package second.com.structural1.Adapter_design_pattern;

import second.com.structural1.Adapter_design_pattern.BusinessCardDesigner;
import second.com.structural1.Adapter_design_pattern.EmployeeClassAdapter;

public class ClientDecoratorDemo {

	public static void main(String[] args) {
		
		EmployeeClassAdapter emp = new EmployeeClassAdapter();
		emp.setFullname("Java 8 ");
		emp.setJobTitle(" SE");
		emp.setOfficeLoaction(" Madhavpur");
		BusinessCardDesigner card= new BusinessCardDesigner();
		String cardPrint = card.designCard(emp);
		System.out.println(cardPrint);

	}
	

}
