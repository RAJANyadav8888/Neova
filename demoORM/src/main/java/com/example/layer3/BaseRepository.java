package com.example.layer3;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.layer2.Employee;


@Repository
public class BaseRepository {
	
	@PersistenceContext
	EntityManager entityManager;
	private Object pk;
	private Class theClass;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	public BaseRepository() {
		System.out.println("BaseRepository()...."+entityManager);
	}
	
	@Transactional
	public void persist(Object obj) { //persist is a dummy/userdefined name
		
		try {
				entityManager.persist(obj);			
		} finally { entityManager.close(); }

	}
	
	@Transactional				//find(Dept.class,10),   find(Emp.class,22);
	public <AnyClass> AnyClass find(Class<AnyClass> theClass, Serializable pk ) {
		AnyClass foundObj = null;
		try {			
			foundObj = entityManager.find(theClass, pk);	
		} finally { entityManager.close(); }
			return foundObj;
	}
	
	@Transactional
	public <E> List  findAll(String pojoName) {
		try {			
			Query query = entityManager.createQuery(" from "+ pojoName); //its not sql, hence it is NOT select * from dept, rather it is select * from Department 
			return query.getResultList();
		} finally { entityManager.close(); }
	}
	
	@Transactional
	public void merge(Object obj) { //update query, if the record doesnot exist, it will insert else update 
		
		try {
			entityManager.merge(obj); //<--real call for jdbc here		
		} finally { entityManager.close(); }
		
	}
	
	@Transactional
	public <AnyClass> void remove(Class<AnyClass> theClass ,Serializable PK) {
	try {
		AnyClass anyClass= entityManager.find(theClass, pk);
	
		if(anyClass==null) {
			throw new RuntimeException("Object not found to delete");
		}
		entityManager.remove(anyClass);
		} finally { entityManager.close(); }
	}
	public void deleteEmployee1(int dno) {
		// TODO Auto-generated method stub
		
	}

	public void updateEmployee1(Employee dobj) {
		// TODO Auto-generated method stub
		
	}

	public Employee selectEmployee(int dno) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee selectEmployee1(int dno) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> selectEmployeements() {
		// TODO Auto-generated method stub
		return null;
	}
}


