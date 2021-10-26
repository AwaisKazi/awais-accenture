package com.northout.springboot.drools.controller;
 
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.northout.springboot.drools.model.Order;
//import java.util.List;
import java.util.ArrayList;
@RestController
public class MegaOfferController {

	@Autowired
	private KieSession session;

	@PostMapping("/order")
	public ArrayList<Order> orderNow(@RequestBody ArrayList<Order> order) {
		for(Order cases : order)
		{
			session.insert(cases);
		}
		session.fireAllRules();
		return order;
	}

	

}




// java.util.List


	// public List<Order> orderNow(@RequestBody Order order) {
	// 	session.insert(order);
	// 	session.fireAllRules();
	// 	return order;