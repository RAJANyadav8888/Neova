package com.example.layer5;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.layer2.Employee;
import com.example.layer3.EmployeeRepositoryImpl;


@Controller
@RequestMapping("/emp")
public class EmpController {
	@Autowired EmployeeRepositoryImpl EmpRepo;
	@GetMapping("/get/{dno}")
    public Employee getEmp(@PathVariable("dno")int x) {
		Employee Emp;
		Emp=EmpRepo.selectEmployee(x);
		return Emp;
	}
	@GetMapping("/getAll")//localhost:8080/dept/getAll
	public List<Employee> getDepts(){
		List<Employee> EmpList;
		EmpList=EmpRepo.selectEmployeements();
	return EmpList;
	}
	
	
	@PostMapping("/getAll") //localhost:8080/dept/add
	public void addDept(@RequestBody Employee Empobj) {
	EmpRepo.insertEmployee(Empobj);	
	}
	@PutMapping("/update")//localhost:8080/Emp/update
	public void updateEmp(@RequestBody Employee emppojo) {
		EmpRepo.updateEmployee(emppojo);
	}
	@DeleteMapping("/delete/{eno}")//localhost:8080/Emp/delete
	public void deleteEmp(@PathVariable("eno") int eno)
	{
		EmpRepo.deleteEmployee(eno);
	}
	}
	


