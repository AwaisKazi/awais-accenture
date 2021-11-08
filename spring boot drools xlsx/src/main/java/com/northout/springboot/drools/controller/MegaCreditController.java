package com.northout.springboot.drools.controller;

 
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.northout.springboot.drools.model.CreditCustomer;
//import com.northout.springboot.drools.model.Customer; 
//import java.util.List;
import java.util.ArrayList;



@RestController
public class MegaCreditController {

	@Autowired
	private KieSession session;

	@PostMapping("/credit")
	public ArrayList<CreditCustomer> customerNow(@RequestBody ArrayList<CreditCustomer> creditCustomer) {
		for(CreditCustomer files : creditCustomer)
		{
			session.insert(files);
		}
		session.fireAllRules();
		return creditCustomer;
	}

	

}