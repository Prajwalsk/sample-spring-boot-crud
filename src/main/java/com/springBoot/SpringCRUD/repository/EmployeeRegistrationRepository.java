package com.springBoot.SpringCRUD.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springBoot.SpringCRUD.model.EmployeeRegistrationModel;

@Repository
public interface EmployeeRegistrationRepository extends JpaRepository<EmployeeRegistrationModel, Integer> {

	List<EmployeeRegistrationModel> findBypassword(String password);
	

	List<EmployeeRegistrationModel> findByUserName(String username);
	
	/*
	 * @Query("FROM new_users ORDER BY ID DESC") List<EmployeeRegistrationModel>
	 * findByUserNameAndPassword(String UserName, String Password);
	 */
	
//	@Query("FROM new_users ORDER BY ID DESC")
	
//	@Query("FROM new_users")
//	List<EmployeeRegistrationModel> findAllEmployeeRegistrationModels();
//	EmployeeRegistrationModel insertUserWithValidation();
	
}
