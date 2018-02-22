package Beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram 
{
	public static void main(String[] args)
	{
		//AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/beans.xml");
		
		AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
		
		System.out.println("Year 1");
		System.out.println("Employee 1: " + accountService.getAccount(1).getEmployeeName() + "\t" + accountService.getAccount(1).getYearsOfExperience() + " years of experience");
		System.out.println("Employee 2: " + accountService.getAccount(2).getEmployeeName() + "\t" + accountService.getAccount(2).getYearsOfExperience() + " years of experience");
		System.out.println("Employee 3: " + accountService.getAccount(3).getEmployeeName() + "\t" + accountService.getAccount(3).getYearsOfExperience() + " years of experience");
		
		accountService.addYear(1);
		accountService.addYear(2);
		accountService.addYear(3);
		
		System.out.println("Year 2");
		System.out.println("Employee 1: " + accountService.getAccount(1).getEmployeeName() + "\t" + accountService.getAccount(1).getYearsOfExperience() + " years of experience");
		System.out.println("Employee 2: " + accountService.getAccount(2).getEmployeeName() + "\t" + accountService.getAccount(2).getYearsOfExperience() + " years of experience");
		System.out.println("Employee 3: " + accountService.getAccount(3).getEmployeeName() + "\t" + accountService.getAccount(3).getYearsOfExperience() + " years of experience");
	}
}
