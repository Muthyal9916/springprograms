package client;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Employee;
import model.Pancard;



public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Employee employee =  context.getBean("emp", Employee.class);
		
		if(employee !=null) {
			System.out.println(employee.getEmployeeId()+"\t"+employee.getName()+"\t"+employee.getEmail());
			
			Pancard pancard = employee.getPancard();
			
			System.out.println(pancard.getPanHolderName()+"\t"+pancard.getPanNo());
		}

		
	}

}
