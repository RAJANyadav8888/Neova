package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.layer2.Department;
import com.example.layer3.DepartmentRepositoryImpl;

@SpringBootTest
class DemoOrmApplicationTests {
	
	@Autowired
	DepartmentRepositoryImpl deptRepo;

	@Test
	void insertDepttest() {
		Department dept=new Department();
		dept.setDepartmentNumber(385);
		dept.setDepartmentName("bds");
		dept.setDepartmentLocation("patna");
		deptRepo.insertDepartment(dept);
	}
	@Test
	void updateDeptTest() {
		Department dept=new Department();
		dept.setDepartmentNumber(385);
		dept.setDepartmentName("ram");
		dept.setDepartmentLocation("agra");
		deptRepo.updateDepartment(dept);
	}
	@Test
	void deleteDeptTest() {
		Department dept=new Department();
		dept.setDepartmentNumber(385);
	}
	@Test
	void SelectDeptTest()
	{
		Department dept;
		dept=deptRepo.selectDepartment(375);
		System.out.println("Dept no:"+dept.getDepartmentNumber());
		System.out.println("Dept Name:"+dept.getDepartmentName());
		System.out.println("Dept Location:"+dept.getDepartmentLocation());
	}
}