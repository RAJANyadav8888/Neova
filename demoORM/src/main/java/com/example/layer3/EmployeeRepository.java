package com.example.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.layer2.Employee ;
@Repository
public interface EmployeeRepository {
void insertEmployee(Employee dobj); //C
	
Employee  selectEmployees(int dno); //R
	List<Employee > selectEmployees(); //RA
	
	void updateEmployee (Employee  dobj); //U
	void deleteEmployee (int dno); //D
	

}
