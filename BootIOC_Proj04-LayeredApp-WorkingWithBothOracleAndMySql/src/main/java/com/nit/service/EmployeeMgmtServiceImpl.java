package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nit.dao.IEmployeeDAO;
import com.nit.model.Employee;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeManagementService {
	
	@Autowired
	@Qualifier
	private IEmployeeDAO empDao;
	
	public EmployeeMgmtServiceImpl()
	{
		System.out.println("EmployeeMgmtServiceImpl::0-param contructor");
	}
	
	@Override   
	public List<Employee> showEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("EmployeeMgmtServiceImpl.showEmployeeByDesgs()");
		// convert desgs into UpperCase letters   (b.logic)
		desg1=desg1.toUpperCase();
		desg2=desg2.toUpperCase();
		desg3=desg3.toUpperCase();
		//  use DAO
		List<Employee> list=empDao.getEmployeesByDesgs(desg1, desg2, desg3);
		
		// calculate gross salary and net salary (b.logic)
		list.forEach(emp -> {
			emp.setGrossSalary(emp.getSalary()+(emp.getSalary()*0.4f));
			emp.setNetSalary(emp.getGrossSalary()-(emp.getGrossSalary()*0.2));
		});
		
		return list;
		
	}

	@Override
	public String registerEmployee(Employee emp) throws Exception {
		// use dao
		int count = empDao.insertEmployee(emp);
		return count==0 ? "Employee is not registered" : "Employee is registered";
	}


}
