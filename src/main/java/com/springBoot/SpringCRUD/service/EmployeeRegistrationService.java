package com.springBoot.SpringCRUD.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.springBoot.SpringCRUD.exceptionhandler.CustomizedException;
import com.springBoot.SpringCRUD.model.EmployeeRegistrationModel;
import com.springBoot.SpringCRUD.model.externalIdAccountSearch;
import com.springBoot.SpringCRUD.repository.EmployeeRegistrationRepository;
import com.springBoot.SpringCRUD.repository.ExternalIdAccountSearchRepo;

@Service
public class EmployeeRegistrationService {

	@Autowired
	EmployeeRegistrationRepository employeeRegistrationRepository;
	
	@Autowired
	ExternalIdAccountSearchRepo externalIdAccountSearchRepo;
	
	public EmployeeRegistrationModel insertDataByValidate(EmployeeRegistrationModel registrationModel) {
		 return employeeRegistrationRepository.save(registrationModel);
	}
	
	public List<EmployeeRegistrationModel> getUserDetailsById(String username) {
		 return employeeRegistrationRepository.findByUserName(username);
	}
	
	/*
	 * public List<EmployeeRegistrationModel> getUserAllDetails(String UserName,
	 * String Password) { List<EmployeeRegistrationModel> list =
	 * employeeRegistrationRepository.findByUserNameAndPassword(UserName, Password);
	 * if(!list.isEmpty()) { return
	 * employeeRegistrationRepository.findByUserNameAndPassword(UserName, Password);
	 * } else { System.out.println("User Not Exists in database"); throw new
	 * CustomizedException("User Not Exists in database for userName" +" " +
	 * UserName + "& password " + Password); } }
	 */
	
	public List<externalIdAccountSearch> serviceDetails() {
		 return externalIdAccountSearchRepo.findAll();
	}
	
}
