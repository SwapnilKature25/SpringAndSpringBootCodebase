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

@Repository("empOraDAO")
public class OracleEmployeeDAOImpl implements IEmployeeDAO {

	private static final String GET_EMPS_BY_DESG="Select EMPNO,ENAME,JOB,SAL,DEPTNO from Emp where JOB IN(?,?,?) order by JOB";
	private static final String INSERT_EMP_QUERY="INSERT INTO EMP (EMPNO,ENAME,JOB,SAL,DEPTNO) VALUES(EMP_SEQ.NEXTVAL,?,?,?,?)";   // we have taken support of sequences to insert the value
	
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
//			e.printStackTrace();
			throw e;  // Exception rethrowing
		}
		
		catch(Exception e)
		{
//			e.printStackTrace();
			throw e;
		}
		 
		return list;
	} // method



	@Override
	public int insertEmployee(Employee emp) throws Exception {
		System.out.println("OracleEmployeeDAOImpl.insertEmployee()");
		int result=0;
		try(
			// get pooled con obj
			Connection con=ds.getConnection();
			// create PreparedStatement object
			PreparedStatement ps=con.prepareStatement(INSERT_EMP_QUERY);				
		){
			// set values to Query params
			ps.setString(1, emp.getENme());
			ps.setString(2, emp.getDesg());
			ps.setDouble(3, emp.getSalary());
			ps.setInt(4, emp.getDeptNo());
			
			// execute the SQL query
			result=ps.executeUpdate();
			return result;
			
 		}
		catch(SQLException e)
		{
//			e.printStackTrace();
			throw e;
		}
		catch(Exception e)
		{
//			e.printStackTrace();    // if we don't put this then we don't get any elaborated messages
			throw e;
		}
	}
	
	

}
