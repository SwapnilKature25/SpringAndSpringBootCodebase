package com.nit;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.controller.PayrollOperationsController;
import com.nit.model.Employee;

@SpringBootApplication
public class BootIocProj03DiMiniProjectApp {

	public static void main(String[] args) {
		//read inputs from end user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Desg1 :: ");
		String desg1=sc.next();
		System.out.println("Enter Desg2 :: ");
		String desg2=sc.next();
		System.out.println("Enter Desg3 :: ");
		String desg3=sc.next();
		
		
		// get IOC Container
		ApplicationContext ctx = SpringApplication.run(BootIocProj03DiMiniProjectApp.class, args);
		
		// get controller class obj ref
		PayrollOperationsController controller=ctx.getBean("payroll",PayrollOperationsController.class);
		
		// invoke the b.methods
		try
		{
			List<Employee> list=controller.processEmployeeByDesg(desg1, desg2, desg3);
			System.out.println("Employee Details for the given Desg :: ");
			if (list.isEmpty()) {
			    System.out.println("No employees found for the given designations.");
			}

			list.forEach(System.out::println);
			list.forEach(emp -> {
				System.out.println(emp);
			});
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

}
