/* Loyalty Controller is a custom API which takes a list of customer objects
 and returns the discount that each customer is eligible for based on how
 many years that customer has been with the company and what state they live in.
*/
package com.northout.springboot.drools.controller;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.northout.springboot.drools.model.Customer;

import java.util.ArrayList;

@RestController
public class LoyaltyController {

	@Autowired
	private KieSession session;

	@PostMapping("/loyal-customers")
	public ArrayList<Customer> orderNow(@RequestBody ArrayList<Customer> customers) {
        for (Customer customer : customers){
            session.insert(customer);
        }
        session.fireAllRules();

        return customers;
	}

}