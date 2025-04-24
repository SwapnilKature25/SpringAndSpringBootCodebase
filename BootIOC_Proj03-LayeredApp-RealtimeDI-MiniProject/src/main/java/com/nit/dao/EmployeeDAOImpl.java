package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {

	private static final String GET_EMPS_BY_DESG="Select empno,ename,job,sal,deptno from Emp where Job IN(?,?,?) order by job";
	
	@Autowired
	private DataSource ds;
	
	  
	
	@Override
	public List<Employee> getEmployeesByDesgs(String desg1, String desg2, String desg3) throws SQLException {
		
		List<Employee> list=null;
		
		try(// get pooled jdbc con obj
			Connection con=ds.getConnection();
			// create JDBC statement obj
			PreparedStatement ps=con.prepareStatement(GET_EMPS_BY_DESG);
			)
				
		{
			//set values to query parameters
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			
			// execute SQL Query
			try(ResultSet rs=ps.executeQuery())
			{
				// copy the records of ResultSet to List of Employee obj
				list = new ArrayList<>();
				while(rs.next())
				{
					// copy each record to employee class obj
					Employee emp = new Employee();
					emp.setEmpNo(rs.getInt(1));
					emp.setENme(rs.getString(2));
					emp.setDesg(rs.getString(3));
					emp.setSalary(rs.getDouble(4));
					emp.setDeptNo(rs.getInt(5));
					// add EMployee class obj to list collection
					list.add(emp);
				} // while
			} // try2
		}//try1
		catch(SQLException e)
		{
			e.printStackTrace();
			throw e;  // Exception rethrowing
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		 
		return list;
	} // method
	
	

}
