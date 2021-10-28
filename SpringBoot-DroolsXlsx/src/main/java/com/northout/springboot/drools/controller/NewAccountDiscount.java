package com.northout.springboot.drools.controller;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import com.northout.springboot.drools.model.CustomerStatus;

@RestController
public class NewAccountDiscount {

    @Autowired
	private KieSession session;

	@PostMapping("/new-account-dicount")
	public ArrayList<CustomerStatus> orderNow(@RequestBody ArrayList< CustomerStatus> status) {
		/*
		session.insert(order);
		session.fireAllRules();
		*/

		for(CustomerStatus s: status){
			session.insert(s);
		}
		session.fireAllRules();
		return status;
	}
    
}
