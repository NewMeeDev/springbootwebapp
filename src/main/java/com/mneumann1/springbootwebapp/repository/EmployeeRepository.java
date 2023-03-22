/**
 * 
 */
package com.mneumann1.springbootwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mneumann1.springbootwebapp.entity.Employee;

/**
 * @author MNEUMANN1
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
