package com.example;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.layer2.Employee;

import com.example.layer3.EmployeeRepositoryImpl;

@SpringBootTest
public class EmployeeTest {
	
	@Autowired
	EmployeeRepositoryImpl EmpRepo;

	
	@Test
	void insertEmpTest() {
		LocalDate Id=LocalDate.of(1998, 10, 12);
		Employee Emp=new Employee();
		Emp.setEmpNo(288);
		Emp.setEName("Raj");
		Emp.setJob("Driver");
		Emp.setmgr(7839);
		Emp.setHireDate(Id);
		Emp.setSal(2000);
		Emp.setComm(200);
		Emp.setDeptno(30);
		EmpRepo.insertEmployee(Emp);
	}

	
	@Test
	void updateEmpTest() {
		LocalDate Id=LocalDate.of(1998, 11, 12);
		Employee Emp=new Employee();
		Emp.setEmpNo(289);
		Emp.setEName("Lakhan");
		Emp.setJob("IT");
		Emp.setmgr(7839);
		Emp.setHireDate(Id);
		Emp.setSal(3000);
		Emp.setComm(2000);
		Emp.setDeptno(30);
		EmpRepo.updateEmployee(Emp);
	}
	
	@Test
	void deleteEmpTest()
	{
		Employee Emp=new Employee();
		Emp.getEmpNo();
		EmpRepo.selectEmployees(288);
	}

	
	/*
	@Test
	void SelectAllEmployeeTest()
	{

		Employee Emp;
		Emp=EmpRepo.selectEmployee(12);
		System.out.println("Emp No:"+Emp.getEmpNo());
		System.out.println("Emp Name:"+Emp.getEName());
		System.out.println("Emp job:"+Emp.getJob());
		System.out.println("Emp mgr:"+Emp.getmgr());
		System.out.println("Emp HireDate:"+Emp.getHireDate());
		System.out.println("Emp Sal:"+Emp.getSal());
		System.out.println("Emp Comm:"+Emp.getComm());
		
	}
	*/
}

