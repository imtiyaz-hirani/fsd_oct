package com.springboot.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.main.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
/* 
 * JpaRepository
 * ------------
 * save(T)
 * deleteById(id)
 * Optional<T> optional = findById(id)
 * findAll() : List<T>
 * */
 