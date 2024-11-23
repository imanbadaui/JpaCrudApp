package com.learnSWE.crud_JPA.employee.jpa;

import com.learnSWE.crud_JPA.employee.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class EmployeeJpaRepository {

    @PersistenceContext
    EntityManager entityManager;

  public void insert(Employee employee){
      entityManager.merge(employee);
  }
  public Employee findById(String id){
    return  entityManager.find(Employee.class, id);
  }

  //update salary.
  public void update(String id, int newSalary){

    Employee updatedEmployee =  entityManager.find(Employee.class, id);
      updatedEmployee.setSalary(newSalary);
      entityManager.merge(updatedEmployee);
  }

  public void deleteById(String id){
      Employee deletedEmployee =  entityManager.find(Employee.class, id);
      entityManager.remove(deletedEmployee);
  }

}
