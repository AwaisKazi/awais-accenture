nes (21 sloc)  796 Bytes
   
package com.northout.springboot.drools.controller;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.northout.springboot.drools.model.Customer;

import java.util.ArrayList;

@RestController
public class Loan{

	@Autowired
	private KieSession session;

	@PostMapping("/loan-applications")
	public ArrayList<Customer> loanApplications(@RequestBody ArrayList<Customer> loanApps) {
        for (Customer c : loanApps){
            session.insert(c);
        }
        session.fireAllRules();

        return loanApps;
	}

}