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

import com.example.layer2.Department;
import com.example.layer3.DepartmentRepositoryImpl;


@Controller
@RequestMapping("/dept")
public class DeptController {
	@Autowired DepartmentRepositoryImpl deptRepo;
	@GetMapping("/get/{dno}")
    public Department getDept(@PathVariable("dno")int x) {
		Department dept;
		dept=deptRepo.selectDepartment(x);
		return dept;
	}
	@GetMapping("/getAll")//localhost:8080/dept/getAll
	public List<Department> getDepts(){
		List<Department> deptList;
		deptList=deptRepo.selectDepartments();
	return deptList;
	}
	
	
	@PostMapping("/getAll") //localhost:8080/dept/add
	public void addDept(@RequestBody Department deptobj) {
	deptRepo.insertDepartment(deptobj);	
	}
	@PutMapping("/update")//localhost:8080/dept/update
	public void updateDept(@RequestBody Department deptobj) {
		deptRepo.updateDepartment(deptobj);
	}
	
	}
	