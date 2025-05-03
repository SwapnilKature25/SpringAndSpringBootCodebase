package com.nit.model;

import lombok.Data;

// Lombok API - https://projectlombok.org/p2   
// Before using lombok in our Eclipse IDE make sure that lombok API related p2 plugin is installed. i.e Lombok API - https://projectlombok.org/p2

@Data      // lombok @Data gives getter, setter, toString(), hashCode(), equals().
public class Employee {
	private Integer empNo;
	private String eNme;
	private String desg;
	private Integer deptNo;
	private Double salary;
	private Double grossSalary;
	private Double netSalary;
	
	
}
