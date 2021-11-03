package com.example.layer3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.layer2.Employee;

@Repository
public class EmployeeRepositoryImpl extends BaseRepository implements EmployeeRepository {

	
	public EmployeeRepositoryImpl() {
			System.out.println("EmployeeRepositoryImpl ..");	
	}
	
	@Transactional
	public void insertEmployee(Employee emppojo) {
		
		super.persist(emppojo); // invoking the dummy persist of the super class
		System.out.println("Employee inserted...");
	}

	@Override
	public Employee selectEmployee(int dno) {
		// TODO Auto-generated method stub
		System.out.println("DepartmentRepositoryImpl : selecting department by deptno");
		Employee Emp = super.find(Employee.class, dno);
		
		return Emp;
	}

	@Override
	public List<Employee> selectEmployees() {
		List<Employee>  deptList = new ArrayList<Employee>();
	
			System.out.println("DepartmentRepositoryImpl : Selecting all departments...");
			return super.findAll("Employee");
		
	}

	@Transactional
	public void updateEmployee(Employee emppojo) {
		// TODO Auto-generated method stub
		System.out.println("EmployeeRepositoryImpl : Updating employee...");
		super.merge(emppojo);
	}

	

	@Override
	public Employee selectEmployees(int dno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(int eno) 
	{
		System.out.println("delete");
		super.remove(Employee.class,eno);
	}

}



