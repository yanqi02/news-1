package ioc7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {

	public static void main(String args[])
	{
		ClassPathXmlApplicationContext cpxl = new ClassPathXmlApplicationContext("applicationContext7.xml");
		RoleAssembly ra = (RoleAssembly)cpxl.getBeanFactory().getBean("roleAssembly");
				
		for(Role r:ra.getList()){
			r.print();
		}
	}
}
