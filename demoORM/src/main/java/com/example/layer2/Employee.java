package com.example.layer2;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="EMP7")
public class Employee {
	@Id
	@Column(name="Empno")
	private int EmpNo;
	
	@Column(name="EName")
	private String EName;
	
	@Column(name="job")
	private String Job;
	
	@Column(name="mgr")
	private int mgr;
	
	@Column(name="hiredate")
	private LocalDate hireDate;
	
	@Column(name="Sal")
	private int Sal;
	
	@Column(name="Comm")
	private int Comm;
	
	@Column(name="Deptno")
	private int Deptno;
	
	public int getEmpNo() {
		return EmpNo;
	}
	public void setEmpNo(int empNo) {
		this.EmpNo = empNo;
	}
	public String getEName() {
		return EName;
	}
	public void setEName(String eName) {
		this.EName = eName;
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String empJob) {
		this.Job = empJob;
	}
	public int getmgr() {
		return mgr;
	}
	public void setmgr(int empmgr) {
		this.mgr = empmgr;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public int getSal() {
		return Sal;
	}
	public void setSal(int empSal) {
		this.Sal = empSal;
	}
	public int getComm() {
		return Comm;
	}
	public void setComm(int empComm) {
		this.Comm = empComm;
	}
	public int getDeptno() {
		return Deptno;
	}
	public void setDeptno(int Deptno) {
		this.Deptno = Deptno;
	}

}
