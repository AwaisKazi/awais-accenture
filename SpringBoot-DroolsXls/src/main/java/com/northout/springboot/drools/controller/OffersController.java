package com.northout.springboot.drools.controller;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.northout.springboot.drools.model.Order;

import java.util.ArrayList;

@RestController
public class OffersController {

	@Autowired
	private KieSession session;

	@PostMapping("/evaluate-orders")
	public ArrayList<Order> orderNow(@RequestBody ArrayList<Order> orders) {
        for (Order order : orders){
            session.insert(order);
        }
        session.fireAllRules();

        return orders;
	}

}
