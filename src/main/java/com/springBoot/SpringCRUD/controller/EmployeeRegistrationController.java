package com.springBoot.SpringCRUD.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.SpringCRUD.exceptionhandler.CustomizedException;
import com.springBoot.SpringCRUD.model.EmployeeRegistrationModel;
import com.springBoot.SpringCRUD.model.externalIdAccountSearch;
import com.springBoot.SpringCRUD.repository.EmployeeRegistrationRepository;
import com.springBoot.SpringCRUD.repository.ExternalIdAccountSearchRepo;
import com.springBoot.SpringCRUD.service.EmployeeRegistrationService;

@RestController
public class EmployeeRegistrationController {
	
	@Autowired
	EmployeeRegistrationService registrationService;
	
	@Autowired
	EmployeeRegistrationRepository employeeRegistrationRepository;
	
	@Autowired
	ExternalIdAccountSearchRepo externalIdAccountSearchRepo;
	
	@RequestMapping(value = "/userRegistration", method = RequestMethod.POST)
	public EmployeeRegistrationModel getUserDetailsFromService(@RequestBody EmployeeRegistrationModel employeeRegistrationModel) {
		List<EmployeeRegistrationModel> list = employeeRegistrationRepository.findBypassword(employeeRegistrationModel.getPassword());
				if(list.isEmpty()) {
					return registrationService.insertDataByValidate(employeeRegistrationModel);
				} else {
					throw new CustomizedException("User alredy Exists.");
				}
	}
	
	@RequestMapping(value = "/user/{username}", method = RequestMethod.GET)
	public List<EmployeeRegistrationModel> getUserDetailsById(@RequestParam String username ) {
		
		return registrationService.getUserDetailsById(username);
	}
	
	
	
	/*
	 * @RequestMapping(value = "/users", method = RequestMethod.GET) public
	 * List<EmployeeRegistrationModel> getUserDetailsById(@RequestParam String
	 * username, @RequestParam String password ) {
	 * 
	 * return registrationService.getUserAllDetails(username, password); }
	 */
	@GetMapping(value="serviceDetails")
public List<externalIdAccountSearch> getserviceDetails() {
//	List<externalIdAccountSearch> accountSearchs = registrationService.serviceDetails();
	return registrationService.serviceDetails();
		
	}
	
	
}
