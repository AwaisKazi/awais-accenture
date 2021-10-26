package com.northout.springboot.drools.controller;

 
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.northout.springboot.drools.model.Customer; 
//import java.util.List;
import java.util.ArrayList;



@RestController
public class MegaLoyaltyController {

	@Autowired
	private KieSession session;

	@PostMapping("/loyalty-discount")
	public ArrayList<Customer> customerNow(@RequestBody ArrayList<Customer> customer) {
		for(Customer files : customer)
		{
			session.insert(files);
		}
		session.fireAllRules();
		return customer;
	}

	

}