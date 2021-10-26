package com.northout.springboot.drools.controller;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import com.northout.springboot.drools.model.Order;

@RestController
public class MegaOfferController {

	@Autowired
	private KieSession session;

	@PostMapping("/order")
	public ArrayList<Order> orderNow(@RequestBody ArrayList<Order> orders) {
		/*
		session.insert(order);
		session.fireAllRules();
		*/

		for(Order o: orders){
			session.insert(o);
		}
		session.fireAllRules();
		return orders;
	}

}
