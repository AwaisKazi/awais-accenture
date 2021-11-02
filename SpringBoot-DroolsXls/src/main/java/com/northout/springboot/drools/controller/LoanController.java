package com.northout.springboot.drools.controller;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.northout.springboot.drools.model.Applicant;

import java.util.ArrayList;

@RestController
public class LoanController {

	@Autowired
	private KieSession session;

	@PostMapping("/loan-applications")
	public ArrayList<Applicant> orderNow(@RequestBody ArrayList<Applicant> applicants) {
        for (Applicant applicant : applicants){
            session.insert(applicant);
        }
        session.fireAllRules();

        return applicants;
	}

}