package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.model.Employee;
import com.nit.service.IEmployeeManagementService;

@Controller("payroll")
public class PayrollOperationsController {
	 
	@Autowired
	private IEmployeeManagementService empService;
	
	public PayrollOperationsController()
	{
		System.out.println("PayrollOperationsController::0-param constructor");
	}
	
	public List<Employee> processEmployeeByDesg(String desg1,String desg2, String desg3) throws Exception{
		// use service
		List<Employee> list=empService.showEmployeeByDesgs(desg1, desg2, desg3);
		return list;
	}
	

}
