  package com.nit;

import java.util.List;
import java.util.Scanner;
import com.nit.service.EmployeeMgmtServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.controller.PayrollOperationsController;
import com.nit.model.Employee;

@SpringBootApplication
public class BootIocProj03DiMiniProjectApp {

    private final EmployeeMgmtServiceImpl empService;

    private final PayrollOperationsController payroll;

    BootIocProj03DiMiniProjectApp(PayrollOperationsController payroll, EmployeeMgmtServiceImpl empService) {
        this.payroll = payroll;
        this.empService = empService;
    }

	public static void main(String[] args) {
		System.out.println("BootIocProj03DiMiniProjectApp.main(start)");
		// get IOC Container
		ApplicationContext ctx = SpringApplication.run(BootIocProj03DiMiniProjectApp.class, args);
		// get controller class obj ref
		PayrollOperationsController controller=ctx.getBean("payroll",PayrollOperationsController.class);
				
		//read inputs from end user
		System.out.println("===================Registering the Employe=============================");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Employee Desg : ");
		String desg = sc.nextLine();
		System.out.println("Enter Employee Salary : ");
		double salary=sc.nextDouble();
		System.out.println("Enter Employee Deptno (10,20,30,40) : ");
		int deptno=sc.nextInt();
		
		// create employee class obj having data
		Employee emp1=new Employee();
		emp1.setENme(name);
		emp1.setDesg(desg);
		emp1.setSalary(salary);
		emp1.setDeptNo(deptno);
		
		// invoke b.method
		try
		{
			String msg=controller.processEmployeeForRegistration(emp1);
			System.out.println(msg);
		}
		catch(Exception e)
		{
			System.out.println("Internal Problem - Try again"+e.getMessage());
//			e.printStackTrace();
		}
		
		
		
		System.out.println("===================Getting employe Details by Desg=====================");
		System.out.println("Enter Desg1 :: ");
		String desg1=sc.next();
		System.out.println("Enter Desg2 :: ");
		String desg2=sc.next();
		System.out.println("Enter Desg3 :: ");
		String desg3=sc.next();
		
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
			System.out.println("Internal Problem --try again : "+e.getMessage());
		}
	
		System.out.println("BootIocProj03DiMiniProjectApp.main(end)");
	}

}
